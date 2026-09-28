package defpackage;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class tuh0 implements ruh0<List<ruh0<?>>> {
    public final List<ruh0<?>> a;

    public tuh0(List<ruh0<?>> list) {
        this.a = list;
    }

    @Override // defpackage.ruh0
    public final String a() {
        return (String) this.a.stream().map(new suh0()).collect(Collectors.joining(", ", "[", "]"));
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
        return evh0.b;
    }

    @Override // defpackage.ruh0
    public final List<ruh0<?>> getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ValueArray{" + a() + "}";
    }
}
