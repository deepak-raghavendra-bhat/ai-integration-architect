package com.hvg.billingmanagement;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.Map;
@RestController
@RequestMapping("/api/billing")
public class BillingController {
 @PostMapping("/process")
 public Map<String,Object> process(@RequestBody Map<String,Object> req){
  return Map.of("status","SUCCESS","receivedPayload",req,"processedAt",Instant.now().toString());
 }
 @GetMapping("/health")
 public Map<String,Object> health(){ return Map.of("status","UP");}
}