package com.sportybet.android.basepay.data;

import defpackage.c0d;
import defpackage.co20;
import defpackage.ib5;
import defpackage.lyh;
import defpackage.myh;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zn20;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llyh;", "Lmyh;", "collector", "", "collect", "(Lmyh;Lv1b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1 implements lyh<Boolean> {
    final /* synthetic */ String $key$inlined;
    final /* synthetic */ lyh $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1$1, reason: invalid class name */
    @c0d(c = "com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1", f = "NewFeatureAlertDataStoreImpl.kt", l = {109}, m = "collect", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass1 extends x1b {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1.this.collect(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass2<T> implements myh {
        final /* synthetic */ String $key$inlined;
        final /* synthetic */ myh $this_unsafeFlow;

        /* JADX INFO: renamed from: com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1$2$1, reason: invalid class name */
        @c0d(c = "com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1$2", f = "NewFeatureAlertDataStoreImpl.kt", l = {50}, m = "emit", v = 2)
        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class AnonymousClass1 extends x1b {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(myh myhVar, String str) {
            this.$this_unsafeFlow = myhVar;
            this.$key$inlined = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            AnonymousClass1 anonymousClass1;
            if (v1bVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) v1bVar;
                int i = anonymousClass1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(v1bVar);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(v1bVar);
            }
            Object obj2 = anonymousClass1.result;
            y5b y5bVar = y5b.a;
            int i2 = anonymousClass1.label;
            if (i2 == 0) {
                uj50.b(obj2);
                myh myhVar = this.$this_unsafeFlow;
                Boolean bool = (Boolean) ((zn20) obj).c(co20.a(this.$key$inlined));
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 1;
                if (myhVar.emit(boolValueOf, anonymousClass1) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1(lyh lyhVar, String str) {
        this.$this_unsafeTransform$inlined = lyhVar;
        this.$key$inlined = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
        AnonymousClass1 anonymousClass1;
        if (v1bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) v1bVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(v1bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(v1bVar);
        }
        Object obj = anonymousClass1.result;
        y5b y5bVar = y5b.a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            uj50.b(obj);
            lyh lyhVar = this.$this_unsafeTransform$inlined;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(myhVar, this.$key$inlined);
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 1;
            if (lyhVar.collect(anonymousClass2, anonymousClass1) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
