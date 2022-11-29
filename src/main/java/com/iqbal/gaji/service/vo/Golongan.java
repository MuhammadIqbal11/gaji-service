/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iqbal.gaji.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author iqbal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Golongan {
    private Long golonganId;
    private String golonganName;
    private Long golonganGajiPokok;
}