package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.HomeAddress;

import java.util.List;

public interface IHomeAddressService extends IService<HomeAddress, Integer>{
    List<HomeAddress> getAll();
}
