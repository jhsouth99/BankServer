package com.example.bankserver.domain.group.belong;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Embeddable
@EqualsAndHashCode
public class BelongId implements Serializable {
    private static final long serialVersionUID = -402216951755905863L;
    private Integer uid;
    private Integer gid;
}
