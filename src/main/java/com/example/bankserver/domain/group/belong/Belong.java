package com.example.bankserver.domain.group.belong;

import com.example.bankserver.domain.group.Group;
import com.example.bankserver.domain.user.User;

import javax.persistence.*;

public class Belong {
    @EmbeddedId
    BelongId belongId;
    @ManyToOne(targetEntity = User.class, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @MapsId("uid")
    @JoinColumn(name = "uid")
    private Integer uid;
    @ManyToOne(targetEntity = Group.class, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    @MapsId("gid")
    @JoinColumn(name = "gid")
    private Integer gid;
    private String role;
}
