package com.sportybet.feature.facialrecognition.presentation;

import android.net.Uri;
import android.util.Pair;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import defpackage.a1k;
import defpackage.avw;
import defpackage.b390;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.f6k;
import defpackage.g6k;
import defpackage.ib5;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.o7h;
import defpackage.o8i0;
import defpackage.p7h;
import defpackage.q7h;
import defpackage.r7h;
import defpackage.rdd0;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vu60;
import defpackage.w950;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.y5b;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/facialrecognition/presentation/c;", "Lavw;", "Lp7h;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends avw<p7h> {
    public final f6k e;
    public final g6k f;
    public final bnh0 i;
    public final rdd0 v;
    public final a1k w;
    public final vu60 y;
    public jvd0 z;

    @c0d(c = "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionViewModel$handleUnicoReturn$2", f = "FacialRecognitionViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                c cVar = c.this;
                String str = (String) cVar.y.b("token");
                if (str == null) {
                    str = "";
                }
                this.a = 1;
                if (cVar.F1(str, this.c, this) == y5bVar) {
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
    public c(f6k f6kVar, g6k g6kVar, bnh0 bnh0Var, rdd0 rdd0Var, a1k a1kVar, vu60 vu60Var) {
        super(new p7h(2));
        bnh0Var.getClass();
        rdd0Var.getClass();
        vu60Var.getClass();
        this.e = f6kVar;
        this.f = g6kVar;
        this.i = bnh0Var;
        this.v = rdd0Var;
        this.w = a1kVar;
        this.y = vu60Var;
    }

    public static Object z1(c cVar, FacialRecognitionResult.b bVar, com.sportybet.feature.facialrecognition.presentation.a.d dVar, String str, x1b x1bVar, int i) {
        com.sportybet.feature.facialrecognition.presentation.a.j jVar;
        com.sportybet.feature.facialrecognition.presentation.a.d dVar2 = (i & 2) != 0 ? null : dVar;
        if ((i & 4) != 0) {
            str = null;
        }
        cVar.getClass();
        if (bVar != FacialRecognitionResult.b.a && bVar != FacialRecognitionResult.b.b && bVar != FacialRecognitionResult.b.c) {
            w950.a("FacialRecognitionViewModel", "endFacialRecognition", new Exception("Facial Recognition error"), kotlin.collections.b.k(new Pair(UserCertConstants.CONFIRM_NAME_USAGE, cVar.C1().a), new Pair(AnalyticsParam.EVENT_STATUS, bVar.name())));
        }
        String strA1 = cVar.A1();
        String strA = b.a(cVar.C1());
        com.sportybet.feature.facialrecognition.presentation.a.l lVarB1 = cVar.B1();
        switch (bVar.ordinal()) {
            case 0:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.Approved;
                break;
            case 1:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.Rejected;
                break;
            case 2:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.CanceledByUser;
                break;
            case 3:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.CouldNotInitializeSdk;
                break;
            case 4:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.CouldNotGetSessionToken;
                break;
            case 5:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.CouldNotConfirmResult;
                break;
            case 6:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.MaxDailyAttemptReached;
                break;
            case 7:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.CloudflareError;
                break;
            case 8:
                jVar = com.sportybet.feature.facialrecognition.presentation.a.j.UnknownError;
                break;
            default:
                uhc.a();
                return null;
        }
        cVar.H1(new com.sportybet.feature.facialrecognition.presentation.a.h(strA1, strA, lVarB1, jVar, dVar2));
        return cVar.c.emit(new o7h.a(new FacialRecognitionResult(bVar, str)), x1bVar);
    }

    public final String A1() {
        vu60 vu60Var = this.y;
        String str = (String) vu60Var.b("flow_id");
        if (str != null) {
            return str;
        }
        this.w.getClass();
        String string = UUID.randomUUID().toString();
        string.getClass();
        vu60Var.e(string, "flow_id");
        return string;
    }

    public final com.sportybet.feature.facialrecognition.presentation.a.l B1() {
        Object next;
        com.sportybet.feature.facialrecognition.presentation.a.l.C0361a c0361a = com.sportybet.feature.facialrecognition.presentation.a.l.b;
        String str = (String) this.y.b(AnalyticsParam.EVENT_STREAM_PROVIDER);
        if (str == null) {
            str = "";
        }
        c0361a.getClass();
        Iterator<T> it = com.sportybet.feature.facialrecognition.presentation.a.l.i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.sportybet.feature.facialrecognition.presentation.a.l) next).a.equals(str));
        com.sportybet.feature.facialrecognition.presentation.a.l lVar = (com.sportybet.feature.facialrecognition.presentation.a.l) next;
        return lVar == null ? com.sportybet.feature.facialrecognition.presentation.a.l.Unknown : lVar;
    }

    public final q7h C1() {
        q7h.a aVar = q7h.b;
        String str = (String) this.y.b(UserCertConstants.CONFIRM_NAME_USAGE);
        if (str == null) {
            str = "";
        }
        aVar.getClass();
        return q7h.a.a(str);
    }

    public final boolean D1(Uri uri) {
        com.sportybet.feature.facialrecognition.presentation.a.b bVar;
        if (uri == null) {
            return false;
        }
        if (Intrinsics.g(uri.getHost(), "www.sporty.bet.br") && Intrinsics.g(uri.getPath(), "/unico-callback")) {
            bVar = com.sportybet.feature.facialrecognition.presentation.a.b.AppLink;
        } else {
            bVar = Intrinsics.g(uri.getHost(), "unico-callback") ? com.sportybet.feature.facialrecognition.presentation.a.b.CustomScheme : null;
        }
        if (bVar == null) {
            return false;
        }
        E1(bVar);
        return true;
    }

    public final void E1(com.sportybet.feature.facialrecognition.presentation.a.b bVar) {
        wwd0 wwd0Var;
        Object value;
        jvd0 jvd0Var = this.z;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        com.sportybet.feature.facialrecognition.presentation.a.l lVar = com.sportybet.feature.facialrecognition.presentation.a.l.Unico;
        vu60 vu60Var = this.y;
        vu60Var.e("unico", AnalyticsParam.EVENT_STREAM_PROVIDER);
        vu60Var.e(Boolean.FALSE, "awaitingUnicoCallback");
        H1(new com.sportybet.feature.facialrecognition.presentation.a.f(A1(), b.a(C1()), lVar, bVar));
        boolean z = bVar == com.sportybet.feature.facialrecognition.presentation.a.b.Restore;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            ((p7h) value).getClass();
        } while (!wwd0Var.g(value, new p7h(true, z)));
        this.z = ej5.c(o8i0.d(this), null, null, new a(z, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071 A[LOOP:0: B:35:0x0071->B:74:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object F1(String str, boolean z, x1b x1bVar) {
        r7h r7hVar;
        int i;
        Object objA;
        int iOrdinal;
        Object objZ1;
        Object objZ2;
        b390 b390Var;
        Object objZ3;
        Object objEmit;
        Object objZ4;
        Object objEmit2;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof r7h) {
            r7hVar = (r7h) x1bVar;
            int i2 = r7hVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r7hVar.f = i2 - Integer.MIN_VALUE;
            } else {
                r7hVar = new r7h(this, x1bVar);
            }
        } else {
            r7hVar = new r7h(this, x1bVar);
        }
        r7h r7hVar2 = r7hVar;
        Object obj = r7hVar2.d;
        y5b y5bVar = y5b.a;
        switch (r7hVar2.f) {
            case 0:
                uj50.b(obj);
                i = z ? 2 : 13;
                r7hVar2.a = str;
                r7hVar2.b = z;
                r7hVar2.c = i;
                r7hVar2.f = 1;
                objA = this.f.a(i, r7hVar2, str);
                if (objA != y5bVar) {
                    g6k.a aVar = (g6k.a) objA;
                    if (z) {
                        do {
                            wwd0Var = this.a;
                            value = wwd0Var.getValue();
                            ((p7h) value).getClass();
                        } while (!wwd0Var.g(value, new p7h(false, false)));
                    }
                    iOrdinal = aVar.ordinal();
                    if (iOrdinal != 0) {
                        FacialRecognitionResult.b bVar = FacialRecognitionResult.b.a;
                        r7hVar2.a = null;
                        r7hVar2.b = z;
                        r7hVar2.c = i;
                        r7hVar2.f = 2;
                        objZ1 = z1(this, bVar, null, str, r7hVar2, 2);
                        if (objZ1 == y5bVar) {
                            return objZ1;
                        }
                    } else if (iOrdinal != 1) {
                        b390Var = this.c;
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                uhc.a();
                                return null;
                            }
                            if (z) {
                                r7hVar2.a = null;
                                r7hVar2.b = z;
                                r7hVar2.c = i;
                                r7hVar2.f = 6;
                                objEmit2 = b390Var.emit(o7h.e.a, r7hVar2);
                                if (objEmit2 == y5bVar) {
                                    return objEmit2;
                                }
                            } else {
                                FacialRecognitionResult.b bVar2 = FacialRecognitionResult.b.f;
                                com.sportybet.feature.facialrecognition.presentation.a.d dVar = com.sportybet.feature.facialrecognition.presentation.a.d.StatusPollResponseError;
                                r7hVar2.a = null;
                                r7hVar2.b = z;
                                r7hVar2.c = i;
                                r7hVar2.f = 7;
                                objZ4 = z1(this, bVar2, dVar, null, r7hVar2, 4);
                                if (objZ4 == y5bVar) {
                                    return objZ4;
                                }
                            }
                        } else if (z) {
                            r7hVar2.a = null;
                            r7hVar2.b = z;
                            r7hVar2.c = i;
                            r7hVar2.f = 4;
                            objEmit = b390Var.emit(o7h.e.a, r7hVar2);
                            if (objEmit == y5bVar) {
                                return objEmit;
                            }
                        } else {
                            FacialRecognitionResult.b bVar3 = FacialRecognitionResult.b.f;
                            com.sportybet.feature.facialrecognition.presentation.a.d dVar2 = com.sportybet.feature.facialrecognition.presentation.a.d.StatusPollNoResult;
                            r7hVar2.a = null;
                            r7hVar2.b = z;
                            r7hVar2.c = i;
                            r7hVar2.f = 5;
                            objZ3 = z1(this, bVar3, dVar2, null, r7hVar2, 4);
                            if (objZ3 == y5bVar) {
                                return objZ3;
                            }
                        }
                    } else {
                        FacialRecognitionResult.b bVar4 = FacialRecognitionResult.b.b;
                        r7hVar2.a = null;
                        r7hVar2.b = z;
                        r7hVar2.c = i;
                        r7hVar2.f = 3;
                        objZ2 = z1(this, bVar4, null, null, r7hVar2, 6);
                        if (objZ2 == y5bVar) {
                            return objZ2;
                        }
                    }
                }
                return y5bVar;
            case 1:
                int i3 = r7hVar2.c;
                z = r7hVar2.b;
                String str2 = r7hVar2.a;
                uj50.b(obj);
                i = i3;
                str = str2;
                objA = obj;
                g6k.a aVar2 = (g6k.a) objA;
                if (z) {
                    do {
                        wwd0Var = this.a;
                        value = wwd0Var.getValue();
                        ((p7h) value).getClass();
                    } while (!wwd0Var.g(value, new p7h(false, false)));
                }
                iOrdinal = aVar2.ordinal();
                if (iOrdinal != 0) {
                    FacialRecognitionResult.b bVar5 = FacialRecognitionResult.b.a;
                    r7hVar2.a = null;
                    r7hVar2.b = z;
                    r7hVar2.c = i;
                    r7hVar2.f = 2;
                    objZ1 = z1(this, bVar5, null, str, r7hVar2, 2);
                    if (objZ1 == y5bVar) {
                        return objZ1;
                    }
                } else if (iOrdinal != 1) {
                    b390Var = this.c;
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            uhc.a();
                            return null;
                        }
                        if (z) {
                            r7hVar2.a = null;
                            r7hVar2.b = z;
                            r7hVar2.c = i;
                            r7hVar2.f = 6;
                            objEmit2 = b390Var.emit(o7h.e.a, r7hVar2);
                            if (objEmit2 == y5bVar) {
                                return objEmit2;
                            }
                        } else {
                            FacialRecognitionResult.b bVar6 = FacialRecognitionResult.b.f;
                            com.sportybet.feature.facialrecognition.presentation.a.d dVar3 = com.sportybet.feature.facialrecognition.presentation.a.d.StatusPollResponseError;
                            r7hVar2.a = null;
                            r7hVar2.b = z;
                            r7hVar2.c = i;
                            r7hVar2.f = 7;
                            objZ4 = z1(this, bVar6, dVar3, null, r7hVar2, 4);
                            if (objZ4 == y5bVar) {
                                return objZ4;
                            }
                        }
                    } else if (z) {
                        r7hVar2.a = null;
                        r7hVar2.b = z;
                        r7hVar2.c = i;
                        r7hVar2.f = 4;
                        objEmit = b390Var.emit(o7h.e.a, r7hVar2);
                        if (objEmit == y5bVar) {
                            return objEmit;
                        }
                    } else {
                        FacialRecognitionResult.b bVar7 = FacialRecognitionResult.b.f;
                        com.sportybet.feature.facialrecognition.presentation.a.d dVar4 = com.sportybet.feature.facialrecognition.presentation.a.d.StatusPollNoResult;
                        r7hVar2.a = null;
                        r7hVar2.b = z;
                        r7hVar2.c = i;
                        r7hVar2.f = 5;
                        objZ3 = z1(this, bVar7, dVar4, null, r7hVar2, 4);
                        if (objZ3 == y5bVar) {
                            return objZ3;
                        }
                    }
                } else {
                    FacialRecognitionResult.b bVar8 = FacialRecognitionResult.b.b;
                    r7hVar2.a = null;
                    r7hVar2.b = z;
                    r7hVar2.c = i;
                    r7hVar2.f = 3;
                    objZ2 = z1(this, bVar8, null, null, r7hVar2, 6);
                    if (objZ2 == y5bVar) {
                        return objZ2;
                    }
                }
                return y5bVar;
            case 2:
                uj50.b(obj);
                return obj;
            case 3:
                uj50.b(obj);
                return obj;
            case 4:
                uj50.b(obj);
                return obj;
            case 5:
                uj50.b(obj);
                return obj;
            case 6:
                uj50.b(obj);
                return obj;
            case 7:
                uj50.b(obj);
                return obj;
            default:
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r7.c.emit(r8, r5) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (z1(r7, r2, r3, null, r5, 4) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G1(defpackage.x1b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.s7h
            if (r0 == 0) goto L14
            r0 = r8
            s7h r0 = (defpackage.s7h) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            s7h r0 = new s7h
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r5.a
            y5b r0 = defpackage.y5b.a
            int r1 = r5.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 == r3) goto L30
            if (r1 != r2) goto L2a
            goto L30
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r4
        L30:
            defpackage.uj50.b(r8)
            goto L7a
        L34:
            defpackage.uj50.b(r8)
            q7h r8 = r7.C1()
            int r8 = r8.ordinal()
            switch(r8) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L4f;
                case 3: goto L4c;
                case 4: goto L49;
                case 5: goto L46;
                case 6: goto L57;
                default: goto L42;
            }
        L42:
            defpackage.uhc.a()
            return r4
        L46:
            j6c r4 = defpackage.j6c.SELF_EXCLUSION
            goto L57
        L49:
            j6c r4 = defpackage.j6c.WITHDRAW
            goto L57
        L4c:
            j6c r4 = defpackage.j6c.RESET_PASSWORD
            goto L57
        L4f:
            j6c r4 = defpackage.j6c.MANAGE_BANK_ACCOUNTS
            goto L57
        L52:
            j6c r4 = defpackage.j6c.TWO_FA_LOGIN
            goto L57
        L55:
            j6c r4 = defpackage.j6c.INT_REGISTER
        L57:
            if (r4 == 0) goto L69
            o7h$d r8 = new o7h$d
            r8.<init>(r4)
            r5.c = r3
            b390 r7 = r7.c
            java.lang.Object r7 = r7.emit(r8, r5)
            if (r7 != r0) goto L7a
            goto L79
        L69:
            r8 = r2
            com.sportybet.feature.facialrecognition.model.FacialRecognitionResult$b r2 = com.sportybet.feature.facialrecognition.model.FacialRecognitionResult.b.v
            com.sportybet.feature.facialrecognition.presentation.a$d r3 = com.sportybet.feature.facialrecognition.presentation.a.d.MissingCaptchaAction
            r5.c = r8
            r4 = 0
            r6 = 4
            r1 = r7
            java.lang.Object r7 = z1(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.feature.facialrecognition.presentation.c.G1(x1b):java.lang.Object");
    }

    public final void H1(com.sportybet.feature.facialrecognition.presentation.a aVar) {
        this.v.a(aVar, k00.d);
    }
}
