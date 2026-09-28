package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common_ui.uitext.UiText;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakStatusUseCase$invoke$1", f = "GetBettingStreakStatusUseCase.kt", l = {20, 22, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class u3k extends tje0 implements Function2<myh<? super lk50<? extends h44>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w3k c;

    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakStatusUseCase$invoke$1$result$1", f = "GetBettingStreakStatusUseCase.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends h44>>, Object> {
        public pjd a;
        public lk50 b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ w3k e;

        /* JADX INFO: renamed from: u3k$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakStatusUseCase$invoke$1$result$1$achievementDeferred$1", f = "GetBettingStreakStatusUseCase.kt", l = {24}, m = "invokeSuspend", v = 2)
        public static final class C1161a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends h04>>, Object> {
            public int a;
            public final /* synthetic */ w3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1161a(w3k w3kVar, v1b<? super C1161a> v1bVar) {
                super(2, v1bVar);
                this.b = w3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1161a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends h04>> v1bVar) {
                return ((C1161a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objE = c34Var.e(this);
                return objE == y5bVar ? y5bVar : objE;
            }
        }

        @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.domain.usecase.GetBettingStreakStatusUseCase$invoke$1$result$1$displayConfigDeferred$1", f = "GetBettingStreakStatusUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super lk50<? extends h44>>, Object> {
            public int a;
            public final /* synthetic */ w3k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(w3k w3kVar, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = w3kVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends h44>> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                c34 c34Var = this.b.a;
                this.a = 1;
                Object objG = c34Var.g(this);
                return objG == y5bVar ? y5bVar : objG;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w3k w3kVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.e = w3kVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.e, v1bVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends h44>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            pjd pjdVarA;
            lk50 lk50Var;
            lk50 lk50Var2;
            Pair pair;
            v5b v5bVar = (v5b) this.d;
            y5b y5bVar = y5b.a;
            int i = this.c;
            Object next = null;
            if (i == 0) {
                uj50.b(obj);
                w3k w3kVar = this.e;
                pjd pjdVarA2 = ej5.a(v5bVar, null, new b(w3kVar, null), 3);
                pjdVarA = ej5.a(v5bVar, null, new C1161a(w3kVar, null), 3);
                this.d = null;
                this.a = pjdVarA;
                this.c = 1;
                obj = pjdVarA2.q(this);
                if (obj != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                pjdVarA = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lk50Var = this.b;
                uj50.b(obj);
            }
            lk50Var2 = (lk50) obj;
            if ((lk50Var instanceof lk50.c) || !(lk50Var2 instanceof lk50.c)) {
                if (lk50Var instanceof lk50.a) {
                    lk50.a aVar = (lk50.a) lk50Var;
                    pair = new Pair(aVar.a, aVar.b);
                } else if (lk50Var2 instanceof lk50.a) {
                    lk50.a aVar2 = (lk50.a) lk50Var2;
                    pair = new Pair(aVar2.a, aVar2.b);
                } else {
                    pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                }
                return new lk50.a((Throwable) pair.a, (UiText) pair.b);
            }
            h44 h44Var = (h44) ((lk50.c) lk50Var).a;
            Iterator<T> it = ((h04) ((lk50.c) lk50Var2).a).b.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i2 = ((a7e0) next).b;
                    do {
                        Object next2 = it.next();
                        int i3 = ((a7e0) next2).b;
                        if (i2 < i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            a7e0 a7e0Var = (a7e0) next;
            int i4 = a7e0Var != null ? a7e0Var.b : 0;
            if (h44Var.c > i4) {
                h44Var = new h44(h44Var.a, h44Var.b, i4, true, h44Var.e);
            }
            return new lk50.c(h44Var);
            lk50 lk50Var3 = (lk50) obj;
            this.d = null;
            this.a = null;
            this.b = lk50Var3;
            this.c = 2;
            Object objAwait = pjdVarA.await(this);
            if (objAwait != y5bVar) {
                obj = objAwait;
                lk50Var = lk50Var3;
                lk50Var2 = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                }
                if (lk50Var instanceof lk50.a) {
                    lk50.a aVar3 = (lk50.a) lk50Var;
                    pair = new Pair(aVar3.a, aVar3.b);
                } else if (lk50Var2 instanceof lk50.a) {
                    lk50.a aVar4 = (lk50.a) lk50Var2;
                    pair = new Pair(aVar4.a, aVar4.b);
                } else {
                    pair = new Pair(new IOException("Unknown error occurred while fetching streak data"), vch0.b);
                }
                return new lk50.a((Throwable) pair.a, (UiText) pair.b);
            }
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3k(w3k w3kVar, v1b<? super u3k> v1bVar) {
        super(2, v1bVar);
        this.c = w3kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u3k u3kVar = new u3k(this.c, v1bVar);
        u3kVar.b = obj;
        return u3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends h44>> myhVar, v1b<? super Unit> v1bVar) {
        return ((u3k) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0.emit((defpackage.lk50) r8, r7) == r1) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            defpackage.uj50.b(r8)
            goto L55
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1e:
            defpackage.uj50.b(r8)
            goto L48
        L22:
            defpackage.uj50.b(r8)
            goto L36
        L26:
            defpackage.uj50.b(r8)
            lk50$b r8 = lk50.b.a
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L36
            goto L54
        L36:
            u3k$a r8 = new u3k$a
            w3k r2 = r7.c
            r8.<init>(r2, r6)
            r7.b = r0
            r7.a = r4
            java.lang.Object r8 = defpackage.w5b.d(r8, r7)
            if (r8 != r1) goto L48
            goto L54
        L48:
            lk50 r8 = (defpackage.lk50) r8
            r7.b = r6
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u3k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
