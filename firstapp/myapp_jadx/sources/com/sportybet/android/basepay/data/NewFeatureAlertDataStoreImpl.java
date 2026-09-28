package com.sportybet.android.basepay.data;

import android.content.Context;
import defpackage.c0d;
import defpackage.co20;
import defpackage.do20;
import defpackage.fqx;
import defpackage.ib5;
import defpackage.jtw;
import defpackage.lyh;
import defpackage.sqc;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.zn20;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/basepay/data/NewFeatureAlertDataStoreImpl;", "Lfqx;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "key", "Llyh;", "", "needShow", "(Ljava/lang/String;)Llyh;", "", "closeForever", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NewFeatureAlertDataStoreImpl implements fqx {
    public static final String PREFERENCE_NAME = "new_feature_alert_preference";
    private final Context context;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$closeForever$1, reason: invalid class name */
    @c0d(c = "com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl", f = "NewFeatureAlertDataStoreImpl.kt", l = {17}, m = "closeForever", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass1 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewFeatureAlertDataStoreImpl.this.closeForever(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$closeForever$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljtw;", "it", "", "<anonymous>", "(Ljtw;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.basepay.data.NewFeatureAlertDataStoreImpl$closeForever$2", f = "NewFeatureAlertDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, v1b<? super AnonymousClass2> v1bVar) {
            super(2, v1bVar);
            this.$key = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, v1bVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass2) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jtw jtwVar = (jtw) this.L$0;
            y5b y5bVar = y5b.a;
            if (this.label != 0) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            zn20.a<Boolean> aVarA = co20.a(this.$key);
            Boolean bool = Boolean.FALSE;
            jtwVar.getClass();
            jtwVar.h(aVarA, bool);
            return Unit.a;
        }
    }

    public NewFeatureAlertDataStoreImpl(Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.fqx
    public Object closeForever(String str, v1b<? super Unit> v1bVar) {
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
            sqc dataStore = NewFeatureAlertDataStoreImplKt.getDataStore(this.context);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, null);
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 1;
            if (do20.a(dataStore, anonymousClass2, anonymousClass1) == y5bVar) {
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

    public final Context getContext() {
        return this.context;
    }

    @Override // defpackage.fqx
    public lyh<Boolean> needShow(String key) {
        key.getClass();
        return new NewFeatureAlertDataStoreImpl$needShow$$inlined$map$1(NewFeatureAlertDataStoreImplKt.getDataStore(this.context).k(), key);
    }
}
