package edu.formation;

import java.util.List;

public interface IDataRecovery<T> {
public List<T> findAll();
public T findById(Long id);
}
