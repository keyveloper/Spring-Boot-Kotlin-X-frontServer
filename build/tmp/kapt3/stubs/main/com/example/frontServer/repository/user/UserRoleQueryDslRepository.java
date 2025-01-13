package com.example.frontServer.repository.user;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/frontServer/repository/user/UserRoleQueryDslRepository;", "", "findRolesByUsername", "", "Lcom/example/frontServer/entity/Role;", "username", "", "frontServer"})
public abstract interface UserRoleQueryDslRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.frontServer.entity.Role> findRolesByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
}