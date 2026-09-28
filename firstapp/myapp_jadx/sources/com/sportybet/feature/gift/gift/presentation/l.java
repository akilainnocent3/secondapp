package com.sportybet.feature.gift.gift.presentation;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.kzh;
import defpackage.lk50;
import defpackage.lyh;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uvk;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$useBoostGift$1", f = "GiftViewModel.kt", l = {452}, m = "invokeSuspend", v = 2)
public final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ String c;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ k b;

        /* JADX INFO: renamed from: com.sportybet.feature.gift.gift.presentation.l$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$useBoostGift$1$invokeSuspend$$inlined$collectAsResult$1", f = "GiftViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0365a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0365a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ k b;

            /* JADX INFO: renamed from: com.sportybet.feature.gift.gift.presentation.l$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.gift.gift.presentation.GiftViewModel$useBoostGift$1$invokeSuspend$$inlined$collectAsResult$1$2", f = "GiftViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0366a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0366a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, k kVar) {
                this.a = myhVar;
                this.b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x001b  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0366a c0366a;
                Object value;
                Object value2;
                Object value3;
                k kVar = this.b;
                wwd0 wwd0Var = kVar.H;
                if (v1bVar instanceof C0366a) {
                    c0366a = (C0366a) v1bVar;
                    int i = c0366a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0366a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0366a = new C0366a(v1bVar);
                    }
                } else {
                    c0366a = new C0366a(v1bVar);
                }
                Object obj2 = c0366a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0366a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, i.a((i) value3, null, null, null, null, null, null, null, d.c.a, 0, null, false, false, 3967)));
                        kVar.A1(uvk.a);
                        kVar.A1(uvk.b);
                        kVar.G.a(e.f.a);
                    } else if (lk50Var instanceof lk50.a) {
                        SprThrowable sprThrowableH = bm50.h((lk50.a) lk50Var);
                        UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, i.a((i) value2, null, null, null, null, null, null, null, new d.a(uiTextB, false), 0, null, false, false, 3967)));
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, i.a((i) value, null, null, null, null, null, null, null, d.b.a, 0, null, false, false, 3967)));
                    }
                    Unit unit = Unit.a;
                    c0366a.b = 1;
                    if (this.a.emit(unit, c0366a) == y5bVar) {
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

        public a(lyh lyhVar, k kVar) {
            this.a = lyhVar;
            this.b = kVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C0365a c0365a;
            if (v1bVar instanceof C0365a) {
                c0365a = (C0365a) v1bVar;
                int i = c0365a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0365a.b = i - Integer.MIN_VALUE;
                } else {
                    c0365a = new C0365a(v1bVar);
                }
            } else {
                c0365a = new C0365a(v1bVar);
            }
            Object obj = c0365a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0365a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0365a.b = 1;
                if (this.a.collect(bVar, c0365a) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, String str, v1b<? super l> v1bVar) {
        super(2, v1bVar);
        this.b = kVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            k kVar = this.b;
            a aVar = new a(kVar.f.l(this.c), kVar);
            this.a = 1;
            if (kzh.a(aVar, this) == y5bVar) {
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
