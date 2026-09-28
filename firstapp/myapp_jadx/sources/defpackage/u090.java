package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.sporty.android.core.model.OrderBetType;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class u090 implements t090 {
    public final Context a;
    public final psm b;
    public final g3z c;
    public final j1b d;
    public final tuw e;
    public final tuw f;
    public Pair<a, ? extends ojd<c190>> g;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final OrderBetType d;
        public final Map<Selection, String> e;

        public a(String str, String str2, String str3, OrderBetType orderBetType, Map<Selection, String> map) {
            str.getClass();
            map.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = orderBetType;
            this.e = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d == aVar.d && Intrinsics.g(this.e, aVar.e);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            OrderBetType orderBetType = this.d;
            return this.e.hashCode() + ((iHashCode3 + (orderBetType != null ? orderBetType.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("CacheKey(bookingCode=", this.a, ", username=", this.b, ", customCode=");
            sbA.append(this.c);
            sbA.append(", orderBetType=");
            sbA.append(this.d);
            sbA.append(", stakes=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b extends CancellationException {
        public static final b a = new b("Preempted by new share request");
    }

    public u090(Context context, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, psm psmVar, g3z g3zVar) {
        psmVar.getClass();
        g3zVar.getClass();
        this.a = context;
        this.b = psmVar;
        this.c = g3zVar;
        this.d = w5b.a(CoroutineContext.Element.a.d(lfe0.a(), oddVar));
        this.e = uuw.a();
        this.f = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    @Override // defpackage.t090
    public final Object a(b190 b190Var, x1b x1bVar) throws Throwable {
        x090 x090Var;
        Object bVar;
        a aVar;
        Throwable thA;
        c190 c190Var;
        Object obj;
        tuw tuwVar;
        a aVar2;
        ojd ojdVarA;
        ojd ojdVar;
        b190 b190Var2 = b190Var;
        if (x1bVar instanceof x090) {
            x090Var = (x090) x1bVar;
            int i = x090Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                x090Var.v = i - Integer.MIN_VALUE;
            } else {
                x090Var = new x090(this, x1bVar);
            }
        } else {
            x090Var = new x090(this, x1bVar);
        }
        Object objAwait = x090Var.f;
        y5b y5bVar = y5b.a;
        int i2 = x090Var.v;
        tuw tuwVar2 = this.e;
        try {
            try {
                if (i2 == 0) {
                    uj50.b(objAwait);
                    a aVar3 = new a(b190Var2.d, b190Var2.c, b190Var2.b, b190Var2.e, b190Var2.f);
                    x090Var.a = b190Var2;
                    x090Var.b = aVar3;
                    x090Var.c = tuwVar2;
                    x090Var.v = 1;
                    if (tuwVar2.d(x090Var) != y5bVar) {
                        tuwVar = tuwVar2;
                        aVar2 = aVar3;
                    }
                    return y5bVar;
                }
                try {
                    if (i2 == 1) {
                        tuw tuwVar3 = x090Var.c;
                        a aVar4 = x090Var.b;
                        b190 b190Var3 = x090Var.a;
                        uj50.b(objAwait);
                        tuwVar = tuwVar3;
                        b190Var2 = b190Var3;
                        aVar2 = aVar4;
                    } else {
                        if (i2 == 2) {
                            a aVar5 = x090Var.b;
                            uj50.b(objAwait);
                            i2 = aVar5;
                            bVar = (c190) objAwait;
                            zi50.a aVar6 = zi50.b;
                            aVar = i2;
                            thA = zi50.a(bVar);
                            if (thA == null) {
                                return bVar;
                            }
                            if ((thA instanceof b) && !(thA.getCause() instanceof b)) {
                                if (thA instanceof CancellationException) {
                                    throw thA;
                                }
                                x090Var.a = null;
                                x090Var.b = aVar;
                                x090Var.c = null;
                                x090Var.d = thA;
                                x090Var.e = tuwVar2;
                                x090Var.v = 3;
                                if (tuwVar2.d(x090Var) != y5bVar) {
                                    obj = aVar;
                                }
                                return y5bVar;
                            }
                            c190Var = new c190((String) null, 3);
                            return c190Var;
                        }
                        if (i2 != 3) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tuwVar2 = x090Var.e;
                        thA = x090Var.d;
                        Object obj2 = x090Var.b;
                        uj50.b(objAwait);
                        obj = obj2;
                    }
                    Pair<a, ? extends ojd<c190>> pair = this.g;
                    if (Intrinsics.g(pair != null ? pair.a : null, obj)) {
                        this.g = null;
                    }
                    Unit unit = Unit.a;
                    tuwVar2.f(null);
                    itf0.a.f(thA, "Failed to fetch share image", new Object[0]);
                    c190Var = new c190((String) null, 3);
                    return c190Var;
                } catch (Throwable th) {
                    tuwVar2.f(null);
                    throw th;
                }
                Pair<a, ? extends ojd<c190>> pair2 = this.g;
                if (pair2 == null || !Intrinsics.g(pair2.a, aVar2)) {
                    if (pair2 != null && (ojdVar = (ojd) pair2.b) != null) {
                        ojdVar.cancel((CancellationException) b.a);
                    }
                    ojdVarA = ej5.a(this.d, null, new y090(null, this, b190Var2), 3);
                    this.g = new Pair<>(aVar2, ojdVarA);
                } else {
                    ojdVarA = (ojd) pair2.b;
                }
                tuwVar.f(null);
                zi50.a aVar7 = zi50.b;
                x090Var.a = null;
                x090Var.b = aVar2;
                x090Var.c = null;
                x090Var.d = null;
                x090Var.v = 2;
                objAwait = ojdVarA.await(x090Var);
                i2 = aVar2;
                if (objAwait != y5bVar) {
                    bVar = (c190) objAwait;
                    zi50.a aVar8 = zi50.b;
                    aVar = i2;
                    thA = zi50.a(bVar);
                    if (thA == null) {
                        return bVar;
                    }
                    if (thA instanceof b) {
                    }
                    c190Var = new c190((String) null, 3);
                    return c190Var;
                }
                return y5bVar;
            } catch (Throwable th2) {
                tuwVar.f(null);
                throw th2;
            }
        } catch (Throwable th3) {
            zi50.a aVar9 = zi50.b;
            bVar = new zi50.b(th3);
            aVar = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.b190 r6, defpackage.x1b r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.v090
            if (r0 == 0) goto L13
            r0 = r7
            v090 r0 = (defpackage.v090) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            v090 r0 = new v090
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r0.c
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            if (r2 != r4) goto L2a
            defpackage.uj50.b(r7)
            goto L56
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L31:
            defpackage.uj50.b(r7)
            goto L4b
        L35:
            defpackage.uj50.b(r7)
            java.lang.String r6 = r6.d
            psm r7 = r5.b
            java.lang.String r7 = r7.Y()
            r0.c = r3
            g3z r2 = r5.c
            java.lang.Object r7 = r2.d(r6, r7, r0)
            if (r7 != r1) goto L4b
            goto L55
        L4b:
            okhttp3.ResponseBody r7 = (okhttp3.ResponseBody) r7
            r0.c = r4
            java.lang.Object r7 = r5.d(r7, r0)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            java.lang.String r7 = (java.lang.String) r7
            c190 r5 = new c190
            r5.<init>(r7, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u090.b(b190, x1b):java.lang.Object");
    }

    public final String c(String str, String str2, List list) throws UnsupportedEncodingException {
        String strA;
        Object bVar;
        Drawable drawable = null;
        if (str2 != null) {
            oaa0.a.getClass();
            try {
                zi50.a aVar = zi50.b;
                maa0 maa0Var = oaa0.c;
                bVar = str2.equals(maa0Var != null ? maa0Var.a : null) ? oaa0.c : (maa0) oaa0.b.get(str2);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            maa0 maa0Var2 = (maa0) bVar;
            if (maa0Var2 != null) {
                drawable = maa0Var2.b;
            }
        }
        Drawable drawable2 = drawable;
        Context context = this.a;
        if (str2 == null || drawable2 == null) {
            strA = str2 != null ? "" : new su3().a(context, list, str, null, null);
        } else {
            strA = new su3().a(context, list, str, drawable2, str2);
        }
        strA.getClass();
        if (strA.length() <= 0) {
            return strA;
        }
        String strDecode = URLDecoder.decode(strA, "UTF-8");
        strDecode.getClass();
        return strDecode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(ResponseBody responseBody, x1b x1bVar) {
        z090 z090Var;
        tuw tuwVar;
        Context context = this.a;
        if (x1bVar instanceof z090) {
            z090Var = (z090) x1bVar;
            int i = z090Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                z090Var.e = i - Integer.MIN_VALUE;
            } else {
                z090Var = new z090(this, x1bVar);
            }
        } else {
            z090Var = new z090(this, x1bVar);
        }
        Object obj = z090Var.c;
        y5b y5bVar = y5b.a;
        int i2 = z090Var.e;
        if (i2 == 0) {
            uj50.b(obj);
            z090Var.a = responseBody;
            tuwVar = this.f;
            z090Var.b = tuwVar;
            z090Var.e = 1;
            if (tuwVar.d(z090Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = z090Var.b;
            responseBody = z090Var.a;
            uj50.b(obj);
        }
        try {
            File file = new File(context.getFilesDir(), "sportybetImage");
            file.mkdirs();
            File file2 = new File(file, "betshare_mx.png");
            try {
                InputStream inputStreamByteStream = responseBody.byteStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        ll5.a(inputStreamByteStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStreamByteStream.close();
                        responseBody.close();
                        String strDecode = URLDecoder.decode(mkh.c(context, yrh0.h(context), file2).toString(), "UTF-8");
                        tuwVar.f(null);
                        strDecode.getClass();
                        return strDecode;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ft7.a(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        ft7.a(inputStreamByteStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    ft7.a(responseBody, th5);
                    throw th6;
                }
            }
        } catch (Throwable th7) {
            tuwVar.f(null);
            throw th7;
        }
    }
}
