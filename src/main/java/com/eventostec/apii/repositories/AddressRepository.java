package com.eventostec.apii.repositories;

import com.eventostec.apii.domain.coupon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository <Coupon, UUID>{
}
