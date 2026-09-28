package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class xp5 {
    public final k5b a;
    public final rm5 b;
    public final db40 c;
    public final OkHttpClient d;
    public final bnh0 e;
    public final List<String> f;
    public final XmlPullParserFactory g;

    public xp5(@Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar, rm5 rm5Var, db40 db40Var, OkHttpClient okHttpClient, bnh0 bnh0Var) {
        db40Var.getClass();
        okHttpClient.getClass();
        bnh0Var.getClass();
        this.a = k5bVar;
        this.b = rm5Var;
        this.c = db40Var;
        this.d = okHttpClient;
        this.e = bnh0Var;
        this.f = b.k("promotion.", "_error_code", "help.");
        this.g = XmlPullParserFactory.newInstance();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [xp5] */
    public final Object a(long j, no5 no5Var, CMSLanguage cMSLanguage, x1b x1bVar) throws IOException {
        rp5 rp5Var;
        Throwable th;
        ?? r1;
        Response responseExecute;
        Reader readerCharStream;
        Reader reader;
        Throwable th2;
        Reader reader2;
        Response response;
        Response response2;
        if (x1bVar instanceof rp5) {
            rp5Var = (rp5) x1bVar;
            int i = rp5Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp5Var.e = i - Integer.MIN_VALUE;
            } else {
                rp5Var = new rp5(this, x1bVar);
            }
        } else {
            rp5Var = new rp5(this, x1bVar);
        }
        rp5 rp5Var2 = rp5Var;
        Object obj = rp5Var2.c;
        y5b y5bVar = y5b.a;
        int i2 = rp5Var2.e;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                responseExecute = FirebasePerfOkHttpClient.execute(this.d.newCall(new Request.Builder().url(this.e.e("cms", "app", no5Var.a, cMSLanguage.getCmsApiLanguageCode(), "strings.xml")).build()));
                try {
                    if (responseExecute.code() == 404 && cMSLanguage != CMSLanguage.ENGLISH) {
                        Unit unit = Unit.a;
                        responseExecute.close();
                        return unit;
                    }
                    if (!responseExecute.getIsSuccessful()) {
                        throw new IOException("Unexpected code " + responseExecute);
                    }
                    ResponseBody responseBodyBody = responseExecute.body();
                    if (responseBodyBody != null && (readerCharStream = responseBodyBody.charStream()) != null) {
                        response2 = responseExecute;
                        response2 = responseExecute;
                        try {
                            sp5 sp5Var = new sp5(this, no5Var, cMSLanguage, null);
                            rp5Var2.a = responseExecute;
                            rp5Var2.b = readerCharStream;
                            rp5Var2.e = 1;
                            reader = readerCharStream;
                            try {
                                if (d(j, reader, sp5Var, rp5Var2) == y5bVar) {
                                    return y5bVar;
                                }
                                reader2 = reader;
                                response = responseExecute;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                reader2 = reader;
                                j = responseExecute;
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            reader = readerCharStream;
                        }
                    }
                    response2 = responseExecute;
                    response2 = responseExecute;
                    response2 = responseExecute;
                    ft7.a(response2, null);
                    return Unit.a;
                } catch (Throwable th5) {
                    th = th5;
                    r1 = responseExecute;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        ft7.a(r1, th);
                        throw th6;
                    }
                }
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reader2 = rp5Var2.b;
            response = rp5Var2.a;
            try {
                uj50.b(obj);
                response = response;
            } catch (Throwable th7) {
                th2 = th7;
                j = response;
                try {
                    throw th2;
                } catch (Throwable th8) {
                    ft7.a(reader2, th2);
                    throw th8;
                }
            }
            Unit unit2 = Unit.a;
            ft7.a(reader2, null);
            response2 = response;
            response2 = responseExecute;
            response2 = responseExecute;
            response2 = responseExecute;
            ft7.a(response2, null);
            return Unit.a;
        } catch (Throwable th9) {
            th = th9;
            r1 = j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        tp5 tp5Var;
        if (x1bVar instanceof tp5) {
            tp5Var = (tp5) x1bVar;
            int i = tp5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp5Var.c = i - Integer.MIN_VALUE;
            } else {
                tp5Var = new tp5(this, x1bVar);
            }
        } else {
            tp5Var = new tp5(this, x1bVar);
        }
        Object objD = tp5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = tp5Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            up5 up5Var = new up5(this, null);
            tp5Var.c = 1;
            objD = ej5.d(this.a, up5Var, tp5Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objD);
        }
        return ((zi50) objD).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(x1b x1bVar) {
        vp5 vp5Var;
        if (x1bVar instanceof vp5) {
            vp5Var = (vp5) x1bVar;
            int i = vp5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp5Var.c = i - Integer.MIN_VALUE;
            } else {
                vp5Var = new vp5(this, x1bVar);
            }
        } else {
            vp5Var = new vp5(this, x1bVar);
        }
        Object objB = vp5Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vp5Var.c;
        if (i2 == 0) {
            uj50.b(objB);
            vp5Var.c = 1;
            objB = this.b.b(vp5Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objB);
        }
        xdp xdpVar = (xdp) objB;
        Set<String> setKeySet = xdpVar.a.keySet();
        ArrayList arrayList = new ArrayList(l48.r(setKeySet, 10));
        for (String str : (hgs.c) setKeySet) {
            str.getClass();
            String strF = xdpVar.j(str).f();
            strF.getClass();
            arrayList.add(new no5(str, Long.parseLong(strF)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:39:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:39:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:39:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b6 -> B:38:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x00b5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(long r9, java.io.Reader r11, defpackage.sp5 r12, defpackage.x1b r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.wp5
            if (r0 == 0) goto L13
            r0 = r13
            wp5 r0 = (defpackage.wp5) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            wp5 r0 = new wp5
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.e
            y5b r1 = defpackage.y5b.a
            int r2 = r0.i
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 != r5) goto L32
            int r8 = r0.d
            long r9 = r0.a
            org.xmlpull.v1.XmlPullParser r11 = r0.c
            kotlin.jvm.functions.Function2 r12 = r0.b
            defpackage.uj50.b(r13)
            goto Lb8
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r4
        L38:
            defpackage.uj50.b(r13)
            org.xmlpull.v1.XmlPullParserFactory r8 = r8.g
            org.xmlpull.v1.XmlPullParser r8 = r8.newPullParser()
            r8.setInput(r11)
            int r11 = r8.getEventType()
            r13 = r12
            r12 = r8
            r8 = r3
        L4b:
            if (r11 == r5) goto Lbf
            r2 = 2
            if (r11 != r2) goto Lba
            java.lang.String r11 = r12.getName()
            java.lang.String r2 = "string"
            boolean r11 = kotlin.jvm.internal.Intrinsics.g(r11, r2)
            if (r11 == 0) goto Lba
            java.lang.String r11 = "name"
            java.lang.String r11 = r12.getAttributeValue(r4, r11)
            java.lang.String r2 = r12.nextText()
            java.lang.String r2 = defpackage.r9e0.a(r2)
            r2.getClass()
            java.lang.String r6 = "%%"
            java.lang.String r7 = "%"
            java.lang.String r2 = kotlin.text.c.p(r2, r6, r7, r3)
            if (r8 != 0) goto L9d
            java.lang.String r8 = "__CMS_VERSION__"
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r11, r8)
            if (r8 == 0) goto L93
            java.lang.Long r8 = kotlin.text.StringsKt.s0(r2)
            if (r8 != 0) goto L86
            goto L8e
        L86:
            long r6 = r8.longValue()
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 == 0) goto L91
        L8e:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L91:
            r8 = r5
            goto Lba
        L93:
            java.lang.String r8 = "First string entry must be __CMS_VERSION__ but now is "
            java.lang.String r8 = defpackage.inm.a(r8, r11)
            defpackage.ib5.a(r8)
            return r4
        L9d:
            n9e0 r6 = new n9e0
            r11.getClass()
            r6.<init>(r11, r2)
            r0.b = r13
            r0.c = r12
            r0.a = r9
            r0.d = r8
            r0.i = r5
            java.lang.Object r11 = r13.invoke(r6, r0)
            if (r11 != r1) goto Lb6
            return r1
        Lb6:
            r11 = r12
            r12 = r13
        Lb8:
            r13 = r12
            r12 = r11
        Lba:
            int r11 = r12.next()
            goto L4b
        Lbf:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp5.d(long, java.io.Reader, sp5, x1b):java.lang.Object");
    }
}
