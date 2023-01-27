/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zaidan.buku.service.repository;

import com.zaidan.buku.service.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP ELITE BOOK G2
 */
@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {

    public Buku findByBukuId(Long bukuId);
    
}
