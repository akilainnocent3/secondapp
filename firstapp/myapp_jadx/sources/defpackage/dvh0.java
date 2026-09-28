package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class dvh0 implements ruh0<String> {
    public final String a;

    public dvh0(String str) {
        this.a = str;
    }

    @Override // defpackage.ruh0
    public final String a() {
        return this.a;
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
        return evh0.a;
    }

    @Override // defpackage.ruh0
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return uf80.a(new StringBuilder("ValueString{"), this.a, "}");
    }
}
