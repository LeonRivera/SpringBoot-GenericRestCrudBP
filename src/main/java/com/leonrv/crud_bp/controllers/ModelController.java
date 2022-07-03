package com.leonrv.crud_bp.controllers;

import org.springframework.web.bind.annotation.*;
import com.leonrv.crud_bp.models.*;
import com.leonrv.crud_bp.repositories.*;

@RestController @RequestMapping("/api/model") @CrossOrigin("*")
public class ModelController extends GenericController<Model> {
    public ModelController(IGenericRepository<Model> repository) {
        super(repository);
    }
}
