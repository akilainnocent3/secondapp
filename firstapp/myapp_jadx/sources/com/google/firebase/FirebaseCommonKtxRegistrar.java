package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bb30;
import defpackage.do8;
import defpackage.gf8;
import defpackage.hi50;
import defpackage.is1;
import defpackage.k5b;
import defpackage.kn8;
import defpackage.rmd;
import defpackage.ubs;
import defpackage.vf4;
import defpackage.wch0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lkn8;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements do8 {
        public static final a<T> a = new a<>();

        @Override // defpackage.do8
        public final Object a(hi50 hi50Var) {
            Object objD = hi50Var.d(new bb30<>(is1.class, Executor.class));
            objD.getClass();
            return gf8.a((Executor) objD);
        }
    }

    public static final class b<T> implements do8 {
        public static final b<T> a = new b<>();

        @Override // defpackage.do8
        public final Object a(hi50 hi50Var) {
            Object objD = hi50Var.d(new bb30<>(ubs.class, Executor.class));
            objD.getClass();
            return gf8.a((Executor) objD);
        }
    }

    public static final class c<T> implements do8 {
        public static final c<T> a = new c<>();

        @Override // defpackage.do8
        public final Object a(hi50 hi50Var) {
            Object objD = hi50Var.d(new bb30<>(vf4.class, Executor.class));
            objD.getClass();
            return gf8.a((Executor) objD);
        }
    }

    public static final class d<T> implements do8 {
        public static final d<T> a = new d<>();

        @Override // defpackage.do8
        public final Object a(hi50 hi50Var) {
            Object objD = hi50Var.d(new bb30<>(wch0.class, Executor.class));
            objD.getClass();
            return gf8.a((Executor) objD);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kn8<?>> getComponents() {
        kn8.a aVarA = kn8.a(new bb30(is1.class, k5b.class));
        aVarA.a(new rmd((bb30<?>) new bb30(is1.class, Executor.class), 1, 0));
        aVarA.f = a.a;
        kn8 kn8VarB = aVarA.b();
        kn8.a aVarA2 = kn8.a(new bb30(ubs.class, k5b.class));
        aVarA2.a(new rmd((bb30<?>) new bb30(ubs.class, Executor.class), 1, 0));
        aVarA2.f = b.a;
        kn8 kn8VarB2 = aVarA2.b();
        kn8.a aVarA3 = kn8.a(new bb30(vf4.class, k5b.class));
        aVarA3.a(new rmd((bb30<?>) new bb30(vf4.class, Executor.class), 1, 0));
        aVarA3.f = c.a;
        kn8 kn8VarB3 = aVarA3.b();
        kn8.a aVarA4 = kn8.a(new bb30(wch0.class, k5b.class));
        aVarA4.a(new rmd((bb30<?>) new bb30(wch0.class, Executor.class), 1, 0));
        aVarA4.f = d.a;
        return kotlin.collections.b.k(kn8VarB, kn8VarB2, kn8VarB3, aVarA4.b());
    }
}
