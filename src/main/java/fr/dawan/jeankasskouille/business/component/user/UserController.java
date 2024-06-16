package fr.dawan.jeankasskouille.business.component.user;

import fr.dawan.jeankasskouille.business.component.user.dtos.UserDto;
import fr.dawan.jeankasskouille.generic.filter.FilterController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends FilterController<UserDto, UserFilter, UserService> {
    public UserController(UserService service) {
        super(service);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @Override
    public void deleteById(long id) {
        super.deleteById(id);
    }
}
