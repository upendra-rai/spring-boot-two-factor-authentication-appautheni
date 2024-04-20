package com.upendra.rai.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import static com.upendra.rai.enums.Permission.ADMIN_CREATE;
import static com.upendra.rai.enums.Permission.ADMIN_DELETE;
import static com.upendra.rai.enums.Permission.ADMIN_READ;
import static com.upendra.rai.enums.Permission.ADMIN_UPDATE;
import static com.upendra.rai.enums.Permission.MANAGER_CREATE;
import static com.upendra.rai.enums.Permission.MANAGER_DELETE;
import static com.upendra.rai.enums.Permission.MANAGER_READ;
import static com.upendra.rai.enums.Permission.MANAGER_UPDATE;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),
    MANAGER_READ("management:read"),
    MANAGER_UPDATE("management:update"),
    MANAGER_CREATE("management:create"),
    MANAGER_DELETE("management:delete")

    ;

    @Getter
    private final String permission;
}
