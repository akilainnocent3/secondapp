package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.recentcode.RecentShareCode;
import com.sporty.android.core.model.recentcode.RecentShareCodeItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getRecentCodeList$1", f = "CodeHubViewmodel.kt", l = {429, 436}, m = "invokeSuspend", v = 2)
public final class qz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public vg40 a;
    public int b;
    public final /* synthetic */ mz7 c;

    @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getRecentCodeList$1$1", f = "CodeHubViewmodel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super BaseResponse<RecentShareCode>>, v1b<? super Unit>, Object> {
        public final /* synthetic */ mz7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mz7 mz7Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = mz7Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<RecentShareCode>> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.M.setValue(bh40.b.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getRecentCodeList$1$3", f = "CodeHubViewmodel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super bh40>, Throwable, v1b<? super Unit>, Object> {
        public final /* synthetic */ mz7 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mz7 mz7Var, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.a = mz7Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super bh40> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new b(this.a, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.a.M;
            bh40.a aVar = new bh40.a("");
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
            return Unit.a;
        }
    }

    public static final class c<T> implements myh {
        public final /* synthetic */ mz7 a;

        public c(mz7 mz7Var) {
            this.a = mz7Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            bh40 bh40Var = (bh40) obj;
            mz7 mz7Var = this.a;
            mz7Var.M.setValue(bh40Var);
            if (bh40Var instanceof bh40.c) {
                ej5.c(o8i0.d(mz7Var), null, null, new tz7(mz7Var, ((bh40.c) bh40Var).a, null), 3);
            }
            return Unit.a;
        }
    }

    public static final class d implements lyh<bh40> {
        public final /* synthetic */ xzh a;
        public final /* synthetic */ mz7 b;

        @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getRecentCodeList$1$invokeSuspend$$inlined$map$1", f = "CodeHubViewmodel.kt", l = {109}, m = "collect", v = 2)
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
                return d.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ mz7 b;

            @c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getRecentCodeList$1$invokeSuspend$$inlined$map$1$2", f = "CodeHubViewmodel.kt", l = {50}, m = "emit", v = 2)
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

            public b(myh myhVar, mz7 mz7Var) {
                this.a = myhVar;
                this.b = mz7Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r7v1, types: [myh] */
            /* JADX WARN: Type inference failed for: r8v10, types: [vg40] */
            /* JADX WARN: Type inference failed for: r9v5, types: [m2g] */
            /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                Object aVar2;
                ?? arrayList;
                ?? arrayList2;
                List<RecentShareCodeItem> shareCodes;
                List<RecentShareCodeItem> shareCodes2;
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
                if (i2 == 0) {
                    uj50.b(obj2);
                    BaseResponse baseResponse = (BaseResponse) obj;
                    BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
                    if (baseResponse.bizCode == 10000) {
                        RecentShareCode recentShareCode = (RecentShareCode) baseResponse.data;
                        if (recentShareCode == null || (shareCodes2 = recentShareCode.getShareCodes()) == null) {
                            arrayList = Collections.EMPTY_LIST;
                        } else {
                            arrayList = new ArrayList(l48.r(shareCodes2, 10));
                            for (RecentShareCodeItem recentShareCodeItem : shareCodes2) {
                                arrayList.add(new ji40(recentShareCodeItem, ji40.a.a(recentShareCodeItem)));
                            }
                        }
                        if (recentShareCode == null || (shareCodes = recentShareCode.getShareCodes()) == null) {
                            arrayList2 = m2g.a;
                        } else {
                            arrayList2 = new ArrayList();
                            Iterator<T> it = shareCodes.iterator();
                            while (it.hasNext()) {
                                String shareCode = ((RecentShareCodeItem) it.next()).getShareCode();
                                if (shareCode != null) {
                                    arrayList2.add(shareCode);
                                }
                            }
                        }
                        this.b.i.c(arrayList2);
                        arrayList.getClass();
                        aVar2 = new bh40.c(arrayList);
                    } else {
                        String str = baseResponse.message;
                        if (str == null) {
                            str = "Data fetch unsuccessful";
                        }
                        aVar2 = new bh40.a(str);
                    }
                    aVar.b = 1;
                    if (this.a.emit(aVar2, aVar) == y5bVar) {
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

        public d(xzh xzhVar, mz7 mz7Var) {
            this.a = xzhVar;
            this.b = mz7Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super bh40> myhVar, v1b v1bVar) {
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
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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
    public qz7(mz7 mz7Var, v1b<? super qz7> v1bVar) {
        super(2, v1bVar);
        this.c = mz7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qz7(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (r3.collect(r7, r6) == r0) goto L15;
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
            int r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            mz7 r5 = r6.c
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L13
            defpackage.uj50.b(r7)
            goto L6a
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L19:
            vg40 r1 = r6.a
            defpackage.uj50.b(r7)
            goto L2f
        L1f:
            defpackage.uj50.b(r7)
            vg40 r1 = r5.i
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r1.a(r6)
            if (r7 != r0) goto L2f
            goto L69
        L2f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.m0(r7)
            lyh r7 = r1.b(r7)
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto r1 = defpackage.mz7.h0
            kotlin.coroutines.CoroutineContext r1 = r5.b
            lyh r7 = defpackage.ozh.c(r7, r1)
            qz7$a r1 = new qz7$a
            r1.<init>(r5, r4)
            xzh r3 = new xzh
            r3.<init>(r7, r1)
            qz7$d r7 = new qz7$d
            r7.<init>(r3, r5)
            qz7$b r1 = new qz7$b
            r1.<init>(r5, r4)
            yzh r3 = new yzh
            r3.<init>(r7, r1)
            qz7$c r7 = new qz7$c
            r7.<init>(r5)
            r6.a = r4
            r6.b = r2
            java.lang.Object r6 = r3.collect(r7, r6)
            if (r6 != r0) goto L6a
        L69:
            return r0
        L6a:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
