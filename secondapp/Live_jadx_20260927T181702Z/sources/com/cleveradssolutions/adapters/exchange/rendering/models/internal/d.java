package com.cleveradssolutions.adapters.exchange.rendering.models.internal;

import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42229a = String.valueOf(j.l());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.api.exceptions.a f42230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.parser.b[] f42231c;

    public d(com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar) {
        this.f42230b = aVar;
    }

    public String a() {
        return this.f42229a;
    }

    public com.cleveradssolutions.adapters.exchange.rendering.parser.b[] b() {
        return this.f42231c;
    }

    public boolean c() {
        return this.f42230b != null;
    }

    public com.cleveradssolutions.adapters.exchange.api.exceptions.a d() {
        return this.f42230b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f42229a;
            String str2 = ((d) obj).f42229a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f42229a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        com.cleveradssolutions.adapters.exchange.api.exceptions.a aVar = this.f42230b;
        return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + Arrays.hashCode(this.f42231c);
    }

    public d(com.cleveradssolutions.adapters.exchange.rendering.parser.b[] bVarArr) {
        this.f42231c = bVarArr;
    }
}
