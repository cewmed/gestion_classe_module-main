package com.ism.repositories;

import java.util.ArrayList;

import com.ism.entities.*;

public interface ClasseRepository extends BaseReposytory<ClasseEntity> {
    ArrayList<ClasseEntity> findAll();
    ArrayList<ModuleEntity> findModuleFromClasse(int id);
    
}
