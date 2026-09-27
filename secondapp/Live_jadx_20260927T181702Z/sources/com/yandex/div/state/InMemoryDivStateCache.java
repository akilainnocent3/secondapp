package com.yandex.div.state;

import dr.v1;
import dr.z0;
import ds.l;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@k.d
public final class InMemoryDivStateCache implements DivStateCache {
    private final Map<z0<String, String>, String> states = Collections.synchronizedMap(new LinkedHashMap());
    private final Map<String, String> rootStates = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: com.yandex.div.state.InMemoryDivStateCache$resetCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements l<z0<? extends String, ? extends String>, Boolean> {
        final /* synthetic */ String $cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$cardId = str;
        }

        @oy.l
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(z0<String, String> z0Var) {
            return Boolean.valueOf(m0.g(z0Var.j(), this.$cardId));
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ Boolean invoke(z0<? extends String, ? extends String> z0Var) {
            return invoke2((z0<String, String>) z0Var);
        }
    }

    @Override // com.yandex.div.state.DivStateCache
    public void clear() {
        this.states.clear();
        this.rootStates.clear();
    }

    @Override // com.yandex.div.state.DivStateCache
    @m
    public String getRootState(@oy.l String str) {
        return this.rootStates.get(str);
    }

    @Override // com.yandex.div.state.DivStateCache
    @m
    public String getState(@oy.l String str, @oy.l String str2) {
        return this.states.get(v1.a(str, str2));
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putRootState(@oy.l String str, @oy.l String str2) {
        this.rootStates.put(str, str2);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void putState(@oy.l String str, @oy.l String str2, @oy.l String str3) {
        this.states.put(v1.a(str, str2), str3);
    }

    @Override // com.yandex.div.state.DivStateCache
    public void resetCard(@oy.l String str) {
        this.rootStates.remove(str);
        fr.m0.I0(this.states.keySet(), new AnonymousClass1(str));
    }
}
