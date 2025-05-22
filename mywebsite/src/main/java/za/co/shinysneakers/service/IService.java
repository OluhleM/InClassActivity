package za.co.shinysneakers.service;



public interface IService<Type, ID> {

    Type create(Type type);

    Type read(ID id);

    Type update(Type type);

}
