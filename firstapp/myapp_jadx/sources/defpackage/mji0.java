package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class mji0 implements lyh<uji0> {
    public final /* synthetic */ wwd0 a;
    public final /* synthetic */ rji0 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$$inlined$map$1", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return mji0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$$inlined$map$1$2", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, rji0 rji0Var) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:65:0x011b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3, types: [dii0] */
        /* JADX WARN: Type inference failed for: r7v5, types: [dii0] */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object eVar;
            ?? r6;
            String str;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            int i3 = 1;
            uji0 uji0Var = null;
            if (i2 == 0) {
                uj50.b(obj2);
                zi50 zi50Var = (zi50) obj;
                if (zi50Var != null) {
                    Object obj3 = zi50Var.a;
                    if (obj3 instanceof zi50.b) {
                        obj3 = null;
                    }
                    List<bii0> list = (List) obj3;
                    if (list == null) {
                        uji0Var = null;
                    } else if (!list.isEmpty()) {
                        int i4 = 10;
                        ArrayList arrayList = new ArrayList(l48.r(list, 10));
                        for (bii0 bii0Var : list) {
                            String str2 = bii0Var.a;
                            String strConcat = "get_started_tab_".concat(bii0Var.b);
                            ArrayList arrayList2 = bii0Var.c;
                            ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, i4));
                            int size = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj4 = arrayList2.get(i5);
                                i5++;
                                vii0 vii0Var = (vii0) obj4;
                                uji0 uji0Var2 = uji0Var;
                                gji0 gji0Var = vii0Var.a;
                                String str3 = vii0Var.b;
                                int iOrdinal = gji0Var.ordinal();
                                if (iOrdinal == 0) {
                                    eVar = new wii0.e(str3);
                                } else if (iOrdinal == i3) {
                                    eVar = new wii0.c(str3);
                                } else if (iOrdinal == 2) {
                                    eVar = new wii0.d(str3);
                                } else if (iOrdinal == 3) {
                                    eVar = new wii0.a(str3);
                                } else {
                                    if (iOrdinal != 4) {
                                        uhc.a();
                                        return uji0Var2;
                                    }
                                    uii0 uii0Var = vii0Var.c;
                                    Object obj5 = uii0Var != null ? uii0Var.a : uji0Var2;
                                    ?? r15 = obj5;
                                    if (obj5 == null) {
                                        r15 = "";
                                    }
                                    if (uii0Var != null) {
                                        str = uii0Var.b;
                                    } else {
                                        r6 = uji0Var2;
                                    }
                                    if (r6 == 0) {
                                        r6 = str;
                                        r6 = "";
                                    }
                                    r6 = str;
                                    eVar = new wii0.b(str3, r15, r6);
                                }
                                arrayList3.add(eVar);
                                uji0Var = uji0Var2;
                                i3 = 1;
                            }
                            uji0 uji0Var3 = uji0Var;
                            uf00 uf00VarF = a4h.f(arrayList3);
                            cii0 cii0Var = bii0Var.d;
                            arrayList.add(new tji0(str2, strConcat, uf00VarF, cii0Var != null ? new dii0(cii0Var.a, cii0Var.b, cii0Var.c) : uji0Var3));
                            uji0Var = uji0Var3;
                            i3 = 1;
                            i4 = 10;
                        }
                        uji0Var = new uji0(a4h.f(arrayList));
                    }
                } else {
                    uji0Var = null;
                }
                aVar.b = 1;
                if (this.a.emit(uji0Var, aVar) == y5bVar) {
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

    public mji0(wwd0 wwd0Var, rji0 rji0Var) {
        this.a = wwd0Var;
        this.b = rji0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super uji0> myhVar, v1b v1bVar) throws Throwable {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        b bVar = new b(myhVar, this.b);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
