package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.helper.CMSHelper$downloadPageAndGetValueForKeys$2", f = "CMSHelper.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class vn5 extends tje0 implements Function2<v5b, v1b<? super Map<String, ? extends String>>, Object> {
    public LinkedHashMap a;
    public Response b;
    public Reader c;
    public int d;
    public final /* synthetic */ xn5 e;
    public final /* synthetic */ ArrayList f;

    @c0d(c = "com.sportygames.newcms.helper.CMSHelper$downloadPageAndGetValueForKeys$2$2$1$1$1", f = "CMSHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<m9e0, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ LinkedHashMap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, LinkedHashMap linkedHashMap, v1b v1bVar) {
            super(2, v1bVar);
            this.b = arrayList;
            this.c = linkedHashMap;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(m9e0 m9e0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(m9e0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            m9e0 m9e0Var = (m9e0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = m9e0Var.a;
            String str2 = m9e0Var.b;
            String strA0 = StringsKt.a0(str, "sg_piggy_bash_game__");
            if (this.b.contains(strA0)) {
                this.c.put(strA0, str2);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn5(xn5 xn5Var, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.e = xn5Var;
        this.f = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vn5(this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Map<String, ? extends String>> v1bVar) {
        return ((vn5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [okhttp3.Response] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v8, types: [okhttp3.Response] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Map mapL;
        xn5 xn5Var;
        Object next;
        Reader reader;
        LinkedHashMap linkedHashMap;
        ?? r1;
        y5b y5bVar = y5b.a;
        ?? Execute = this.d;
        try {
            if (Execute == 0) {
                uj50.b(obj);
                uag uagVar = zn5.d;
                q3.b bVarA = ocx.a(uagVar, uagVar);
                do {
                    boolean zHasNext = bVarA.hasNext();
                    xn5Var = this.e;
                    if (!zHasNext) {
                        next = null;
                        break;
                    }
                    next = bVarA.next();
                } while (!((zn5) next).a.equals(xn5Var.a.getLanguageCode()));
                zn5 zn5Var = (zn5) next;
                if (zn5Var != null) {
                    ArrayList arrayList = this.f;
                    try {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Execute = FirebasePerfOkHttpClient.execute(xn5Var.e.newCall(new Request.Builder().url(xn5Var.b + "cms/app/sg_piggy_bash_game/" + zn5Var.b + "/strings.xml").build()));
                        if (Execute.getIsSuccessful()) {
                            Reader readerCharStream = Execute.body().charStream();
                            try {
                                o8k0 o8k0Var = o8k0.a;
                                a aVar = new a(arrayList, linkedHashMap2, null);
                                this.a = linkedHashMap2;
                                this.b = Execute;
                                this.c = readerCharStream;
                                this.d = 1;
                                if (o8k0Var.a(readerCharStream, aVar, this) == y5bVar) {
                                    return y5bVar;
                                }
                                reader = readerCharStream;
                                linkedHashMap = linkedHashMap2;
                                Execute = Execute;
                            } catch (Throwable th) {
                                th = th;
                                reader = readerCharStream;
                                throw th;
                            }
                        } else {
                            mapL = null;
                            r1 = Execute;
                        }
                        ft7.a(r1, null);
                    } catch (Exception unused) {
                        mapL = o2g.a;
                        mapL.getClass();
                    }
                    if (mapL != null) {
                        return mapL;
                    }
                }
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                return o2gVar;
            }
            if (Execute != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reader = this.c;
            Execute = this.b;
            linkedHashMap = this.a;
            try {
                uj50.b(obj);
                Execute = Execute;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ft7.a(reader, th);
                    throw th3;
                }
            }
            mapL = kpu.l(linkedHashMap);
            ft7.a(reader, null);
            r1 = Execute;
            ft7.a(r1, null);
            if (mapL != null) {
                return mapL;
            }
            o2g o2gVar2 = o2g.a;
            o2gVar2.getClass();
            return o2gVar2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ft7.a(Execute, th4);
                throw th5;
            }
        }
    }
}
