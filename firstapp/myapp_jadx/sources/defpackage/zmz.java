package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", l = {136}, m = "invokeSuspend")
public final class zmz extends tje0 implements Function2<hk90<kqz<Object>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r650<Object, Object> c;
    public final /* synthetic */ ymz<Object, Object> d;

    @c0d(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", l = {63, 63}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<myh<? super Boolean>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ x650<Object, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x650<Object, Object> x650Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = x650Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Boolean> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x003f  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L23;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r7)
                goto L4f
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L17:
                java.lang.Object r1 = r6.b
                myh r1 = (defpackage.myh) r1
                defpackage.uj50.b(r7)
                goto L36
            L1f:
                defpackage.uj50.b(r7)
                java.lang.Object r7 = r6.b
                r1 = r7
                myh r1 = (defpackage.myh) r1
                x650<java.lang.Object, java.lang.Object> r7 = r6.c
                if (r7 == 0) goto L39
                r6.b = r1
                r6.a = r4
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r0) goto L36
                goto L4e
            L36:
                r650$a r7 = (r650.a) r7
                goto L3a
            L39:
                r7 = r2
            L3a:
                r650$a r5 = r650.a.a
                if (r7 != r5) goto L3f
                goto L40
            L3f:
                r4 = 0
            L40:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                r6.b = r2
                r6.a = r3
                java.lang.Object r6 = r1.emit(r7, r6)
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zmz.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", l = {73, 77}, m = "invokeSuspend")
    public static final class b extends tje0 implements gaj<ymz.a<Object, Object>, Boolean, v1b<? super ymz.a<Object, Object>>, Object> {
        public wqz a;
        public int b;
        public /* synthetic */ ymz.a c;
        public /* synthetic */ boolean d;
        public final /* synthetic */ x650<Object, Object> e;
        public final /* synthetic */ ymz<Object, Object> f;

        public /* synthetic */ class a extends saj implements Function0<Unit> {
            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                ((ymz) this.receiver).c.a(Boolean.TRUE);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, ymz ymzVar, x650 x650Var) {
            super(3, v1bVar);
            this.e = x650Var;
            this.f = ymzVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(ymz.a<Object, Object> aVar, Boolean bool, v1b<? super ymz.a<Object, Object>> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            b bVar = new b(v1bVar, this.f, this.e);
            bVar.c = aVar;
            bVar.d = zBooleanValue;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0063  */
        /* JADX WARN: Code duplicated, block: B:31:0x0066  */
        /* JADX WARN: Code duplicated, block: B:44:0x0083  */
        /* JADX WARN: Code duplicated, block: B:45:0x0086  */
        /* JADX WARN: Code duplicated, block: B:47:0x0089  */
        /* JADX WARN: Code duplicated, block: B:51:0x0092  */
        /* JADX WARN: Code duplicated, block: B:53:0x0095  */
        /* JADX WARN: Code duplicated, block: B:56:0x009a  */
        /* JADX WARN: Code duplicated, block: B:57:0x009c  */
        /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ymz.a aVar;
            Object objA;
            x650<Object, Object> x650Var;
            xqz xqzVar;
            wqz wqzVar;
            Object objB;
            Collection collection;
            xqz xqzVar2;
            Collection collection2;
            Integer num;
            xqz xqzVar3;
            Object objB2;
            Integer num2;
            xqz<Key, Value> xqzVar4;
            y5b y5bVar = y5b.a;
            int i = this.b;
            ymz<Object, Object> ymzVar = this.f;
            if (i == 0) {
                uj50.b(obj);
                aVar = this.c;
                if (this.d && (x650Var = this.e) != null) {
                    x650Var.b();
                }
                wqz wqzVar2 = aVar != null ? aVar.a.b : null;
                this.c = aVar;
                this.b = 1;
                objA = ymzVar.a(wqzVar2, this);
                if (objA != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                aVar = this.c;
                uj50.b(obj);
                objA = obj;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wqzVar = this.a;
                aVar = this.c;
                uj50.b(obj);
                objB = obj;
            }
            xqzVar = (xqz) objB;
            if (xqzVar != null) {
                collection = xqzVar.a;
            } else {
                collection = null;
            }
            if ((collection != null || collection.isEmpty()) && aVar != null && (xqzVar2 = aVar.b) != null && (collection2 = xqzVar2.a) != null && (!collection2.isEmpty())) {
            }
            if (xqzVar != null) {
                num = xqzVar.b;
            } else {
                num = null;
            }
            if (num == null) {
                if (aVar != null || (xqzVar4 = aVar.b) == 0) {
                    num2 = null;
                } else {
                    num2 = xqzVar4.b;
                }
                if (num2 != null) {
                    xqzVar = aVar.b;
                }
            }
            xqzVar3 = xqzVar;
            if (xqzVar3 == null) {
                objB2 = null;
            } else {
                objB2 = wqzVar.b(xqzVar3);
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Refresh key " + objB2 + " returned from PagingSource " + wqzVar, null);
                }
            }
            if (aVar != null) {
                aVar.a.k.cancel((CancellationException) null);
            }
            if (aVar != null) {
                aVar.c.cancel((CancellationException) null);
            }
            return new ymz.a(new enz(objB2, wqzVar, ymzVar.b, ymzVar.d.b, this.e, xqzVar3, new a(0, ymzVar, ymz.class, "refresh", "refresh()V", 0)), xqzVar3, i9p.a());
            wqz wqzVar3 = (wqz) objA;
            if (aVar != null) {
                enz<Key, Value> enzVar = aVar.a;
                this.c = aVar;
                this.a = wqzVar3;
                this.b = 2;
                objB = enzVar.b(this);
                if (objB != y5bVar) {
                    wqzVar = wqzVar3;
                    xqzVar = (xqz) objB;
                }
                return y5bVar;
            }
            xqzVar = null;
            wqzVar = wqzVar3;
            if (xqzVar != null) {
                collection = xqzVar.a;
            } else {
                collection = null;
            }
            xqzVar = collection != null ? xqzVar2 : xqzVar2;
            if (xqzVar != null) {
                num = xqzVar.b;
            } else {
                num = null;
            }
            if (num == null) {
                if (aVar != null) {
                    num2 = null;
                } else {
                    num2 = null;
                }
                if (num2 != null) {
                    xqzVar = aVar.b;
                }
            }
            xqzVar3 = xqzVar;
            if (xqzVar3 == null) {
                objB2 = null;
            } else {
                objB2 = wqzVar.b(xqzVar3);
                if (Build.ID != null) {
                    Log.d("Paging", "Refresh key " + objB2 + " returned from PagingSource " + wqzVar, null);
                }
            }
            if (aVar != null) {
                aVar.a.k.cancel((CancellationException) null);
            }
            if (aVar != null) {
                aVar.c.cancel((CancellationException) null);
            }
            return new ymz.a(new enz(objB2, wqzVar, ymzVar.b, ymzVar.d.b, this.e, xqzVar3, new a(0, ymzVar, ymz.class, "refresh", "refresh()V", 0)), xqzVar3, i9p.a());
        }
    }

    @c0d(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<xmz<Object>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(2, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xmz<Object> xmzVar, v1b<? super Unit> v1bVar) {
            return ((c) create(xmzVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            xmz xmzVar = (xmz) this.a;
            if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                Log.v("Paging", "Sent " + xmzVar, null);
            }
            return Unit.a;
        }
    }

    public /* synthetic */ class d implements myh, paj {
        public final /* synthetic */ hk90<kqz<Object>> a;

        public d(hk90<kqz<Object>> hk90Var) {
            this.a = hk90Var;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return new saj(2, this.a, hk90.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object objJ = this.a.j(v1bVar, (kqz) obj);
            return objJ == y5b.a ? objJ : Unit.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof myh) && (obj instanceof paj)) {
                return c().equals(((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    @c0d(c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", f = "PageFetcher.kt", l = {105}, m = "invokeSuspend")
    public static final class e extends tje0 implements gaj<myh<? super kqz<Object>>, ymz.a<Object, Object>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ymz d;
        public final /* synthetic */ x650 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, ymz ymzVar, x650 x650Var) {
            super(3, v1bVar);
            this.d = ymzVar;
            this.e = x650Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super kqz<Object>> myhVar, ymz.a<Object, Object> aVar, v1b<? super Unit> v1bVar) {
            e eVar = new e(v1bVar, this.d, this.e);
            eVar.b = myhVar;
            eVar.c = aVar;
            return eVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                ymz.a aVar = (ymz.a) this.c;
                enz<Key, Value> enzVar = aVar.a;
                e9p e9pVar = aVar.c;
                x650 x650Var = this.e;
                g1i g1iVar = new g1i(x650Var == null ? enzVar.l : rj90.a(new vb6(e9pVar, new dnz(x650Var, enzVar, new tsw(), null), null)), new c(2, null));
                ymz ymzVar = this.d;
                kqz kqzVar = new kqz(g1iVar, new ymz.c(ymzVar, ymzVar.d), new ymz.b(aVar.a), jqz.a);
                this.a = 1;
                if (myhVar.emit(kqzVar, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmz(r650<Object, Object> r650Var, ymz<Object, Object> ymzVar, v1b<? super zmz> v1bVar) {
        super(2, v1bVar);
        this.c = r650Var;
        this.d = ymzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zmz zmzVar = new zmz(this.c, this.d, v1bVar);
        zmzVar.b = obj;
        return zmzVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hk90<kqz<Object>> hk90Var, v1b<? super Unit> v1bVar) {
        return ((zmz) create(hk90Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        s650 s650Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            hk90 hk90Var = (hk90) this.b;
            r650<Object, Object> r650Var = this.c;
            if (r650Var != null) {
                hk90Var.getClass();
                s650Var = new s650(hk90Var, r650Var);
            } else {
                s650Var = null;
            }
            ymz<Object, Object> ymzVar = this.d;
            lyh lyhVarA = rj90.a(new vyh(new f1i(new or60(new uyh(new xzh(ymzVar.c.b, new a(s650Var, null)), new b(null, ymzVar, s650Var), null))), new e(null, ymzVar, s650Var), null));
            d dVar = new d(hk90Var);
            this.a = 1;
            if (lyhVarA.collect(dVar, this) == y5bVar) {
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
