package guru.springframework.msscbakery.services;

import guru.springframework.msscbakery.web.model.BreadDto;

import java.util.UUID;

public interface BreadService {

    public BreadDto getBreadId(UUID breadId);
}
