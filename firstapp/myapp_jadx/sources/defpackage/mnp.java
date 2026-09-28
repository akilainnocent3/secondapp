package defpackage;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class mnp implements ruh0<List<inp>> {
    public final List<inp> a;

    public mnp(List<inp> list) {
        this.a = list;
    }

    @Override // defpackage.ruh0
    public final String a() {
        return (String) this.a.stream().map(new knp()).collect(Collectors.joining(", ", "[", "]"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ruh0) {
            return Objects.equals(this.a, ((ruh0) obj).getValue());
        }
        return false;
    }

    @Override // defpackage.ruh0
    public final evh0 getType() {
        return evh0.c;
    }

    @Override // defpackage.ruh0
    public final List<inp> getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyValueList{" + a() + "}";
    }
}
