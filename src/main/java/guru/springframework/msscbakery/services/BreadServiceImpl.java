package guru.springframework.msscbakery.services;

import guru.springframework.msscbakery.web.model.BreadDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BreadServiceImpl implements BreadService {
    @Override
    public BreadDto getBreadId(UUID breadId) {
        return BreadDto.builder().id(UUID.randomUUID())
                .breadName("Baguette")
                .breadStyle("French")
                .upc(0l)
                .build();
    }
}
