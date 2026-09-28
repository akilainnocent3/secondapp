package com.sportybet.plugin.realsports.data.promotion;

import android.content.Context;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import defpackage.c0d;
import defpackage.do20;
import defpackage.ej5;
import defpackage.f530;
import defpackage.ib5;
import defpackage.jtw;
import defpackage.k5b;
import defpackage.sqc;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import defpackage.zn20;
import defpackage.zu7;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u0014\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/promotion/PromotionDataStoreImpl;", "Lf530;", "Landroid/content/Context;", "context", "Lk5b;", "ioDispatcher", "mainDispatcher", "<init>", "(Landroid/content/Context;Lk5b;Lk5b;)V", "Lkotlin/Function1;", "", "", "callback", "isGetGiftsEnabled", "(Lkotlin/jvm/functions/Function1;)V", "disableGetGifts", "()V", "Landroid/content/Context;", "Lk5b;", "getIoDispatcher$annotations", "getMainDispatcher$annotations", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PromotionDataStoreImpl implements f530 {
    private static final String PREF_GET_GIFTS = "PREF_GET_GIFTS";
    private final Context context;
    private final k5b ioDispatcher;
    private final k5b mainDispatcher;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$disableGetGifts$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$disableGetGifts$1", f = "PromotionDataStoreImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$disableGetGifts$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljtw;", "it", "", "<anonymous>", "(Ljtw;)V"}, k = 3, mv = {2, 4, 0})
        @c0d(c = "com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$disableGetGifts$1$1", f = "PromotionDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C04261 extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C04261(v1b<? super C04261> v1bVar) {
                super(2, v1bVar);
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C04261 c04261 = new C04261(v1bVar);
                c04261.L$0 = obj;
                return c04261;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
                return ((C04261) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
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
                zn20.a<?> aVar = new zn20.a<>(PromotionDataStoreImpl.PREF_GET_GIFTS);
                Boolean bool = Boolean.FALSE;
                jtwVar.getClass();
                jtwVar.h(aVar, bool);
                return Unit.a;
            }
        }

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return PromotionDataStoreImpl.this.new AnonymousClass1(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((AnonymousClass1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.label;
            if (i == 0) {
                uj50.b(obj);
                sqc dataStore = PromotionDataStoreImplKt.getDataStore(PromotionDataStoreImpl.this.context);
                C04261 c04261 = new C04261(null);
                this.label = 1;
                if (do20.a(dataStore, c04261, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1", f = "PromotionDataStoreImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 40}, m = "invokeSuspend", v = 2)
    public static final class C14571 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $callback;
        int I$0;
        int label;

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
        @c0d(c = "com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$1", f = "PromotionDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C04271 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            final /* synthetic */ Function1<Boolean, Unit> $callback;
            final /* synthetic */ boolean $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04271(Function1<? super Boolean, Unit> function1, boolean z, v1b<? super C04271> v1bVar) {
                super(2, v1bVar);
                this.$callback = function1;
                this.$result = z;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C04271(this.$callback, this.$result, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C04271) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                if (this.label != 0) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                this.$callback.invoke(Boolean.valueOf(this.$result));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14571(Function1<? super Boolean, Unit> function1, v1b<? super C14571> v1bVar) {
            super(2, v1bVar);
            this.$callback = function1;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return PromotionDataStoreImpl.this.new C14571(this.$callback, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C14571) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            if (defpackage.ej5.d(r7, r1, r6) == r0) goto L18;
         */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1b
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r7)
                goto L64
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L17:
                defpackage.uj50.b(r7)
                goto L44
            L1b:
                defpackage.uj50.b(r7)
                com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl r7 = com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl.this
                android.content.Context r7 = com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl.access$getContext$p(r7)
                sqc r7 = com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImplKt.access$getDataStore(r7)
                lyh r7 = r7.k()
                com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1 r1 = new com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$result$1
                r1.<init>(r2)
                yzh r5 = new yzh
                r5.<init>(r7, r1)
                com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$invokeSuspend$$inlined$map$1 r7 = new com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$invokeSuspend$$inlined$map$1
                r7.<init>(r5)
                r6.label = r4
                java.lang.Object r7 = defpackage.s0i.c(r7, r6)
                if (r7 != r0) goto L44
                goto L63
            L44:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                if (r7 == 0) goto L4c
                boolean r4 = r7.booleanValue()
            L4c:
                com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl r7 = com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl.this
                k5b r7 = com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl.access$getMainDispatcher$p(r7)
                com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$1 r1 = new com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl$isGetGiftsEnabled$1$1
                kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r5 = r6.$callback
                r1.<init>(r5, r4, r2)
                r6.I$0 = r4
                r6.label = r3
                java.lang.Object r6 = defpackage.ej5.d(r7, r1, r6)
                if (r6 != r0) goto L64
            L63:
                return r0
            L64:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl.C14571.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public PromotionDataStoreImpl(Context context, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, @Dispatcher(sportyDispatcher = SportyDispatchers.Main) k5b k5bVar2) {
        context.getClass();
        k5bVar.getClass();
        k5bVar2.getClass();
        this.context = context;
        this.ioDispatcher = k5bVar;
        this.mainDispatcher = k5bVar2;
    }

    @Dispatcher(sportyDispatcher = SportyDispatchers.IO)
    private static /* synthetic */ void getIoDispatcher$annotations() {
    }

    @Dispatcher(sportyDispatcher = SportyDispatchers.Main)
    private static /* synthetic */ void getMainDispatcher$annotations() {
    }

    @Override // defpackage.f530
    public void disableGetGifts() {
        zu7.a aVar = zu7.a;
        k5b k5bVar = this.ioDispatcher;
        ej5.c(zu7.b(k5bVar), null, null, new AnonymousClass1(null), 3);
    }

    @Override // defpackage.f530
    public void isGetGiftsEnabled(Function1<? super Boolean, Unit> callback) {
        callback.getClass();
        zu7.a aVar = zu7.a;
        k5b k5bVar = this.ioDispatcher;
        ej5.c(zu7.b(k5bVar), null, null, new C14571(callback, null), 3);
    }
}
