package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sportygames.compose.chat.data.model.AddGroupResponse;
import com.sportygames.compose.chat.data.model.ChatErrorResponse;
import com.sportygames.compose.chat.data.model.ChatListResponse;
import com.sportygames.newcms.b;
import com.sportygames.newcms.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class hh7 extends j8i0 {
    public final wwd0 A;
    public final v340 B;
    public final wwd0 C;
    public final v340 D;
    public final wwd0 E;
    public final wwd0 F;
    public final v340 G;
    public boolean H;
    public final wwd0 I;
    public final b390 J;
    public final t340 K;
    public final kb2 a;
    public final vb7 b;
    public final wb7 c;
    public final xb7 d;
    public final b5 e;
    public final d f;
    public final fa7 i;
    public final mpe0 v;
    public final mpe0 w;
    public final mpe0 y;
    public final mpe0 z;

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.compose.chat.ui.ChatViewModel$connect$1", f = "ChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<jj50<? extends AddGroupResponse>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = hh7.this.new a(this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jj50<? extends AddGroupResponse> jj50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(jj50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hh7 hh7Var = hh7.this;
            wwd0 wwd0Var = hh7Var.A;
            jj50 jj50Var = (jj50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (jj50Var instanceof jj50.c) {
                wwd0 wwd0Var2 = hh7Var.F;
                AddGroupResponse addGroupResponse = (AddGroupResponse) ((jj50.c) jj50Var).a;
                Boolean nickNameAvailable = addGroupResponse.getNickNameAvailable();
                osa0.a(nickNameAvailable != null ? nickNameAvailable.booleanValue() : true, wwd0Var2, null);
                String strValueOf = String.valueOf(addGroupResponse.getLastMessageNo());
                v8k v8kVar = (v8k) hh7Var.w.getValue();
                v8kVar.getClass();
                String str = this.c;
                str.getClass();
                strValueOf.getClass();
                kzh.d(new g1i(new or60(new u8k(v8kVar, str, strValueOf, null)), new lh7(hh7Var, null)), o8i0.d(hh7Var));
            } else if (jj50Var instanceof jj50.a) {
                StringBuilder sb = new StringBuilder("Error: ");
                ChatErrorResponse chatErrorResponse = ((jj50.a) jj50Var).b;
                sb.append(chatErrorResponse != null ? chatErrorResponse.getErrorName() : null);
                bh7.a aVar = new bh7.a(sb.toString());
                wwd0Var.getClass();
                wwd0Var.k(null, aVar);
            } else {
                if (!(jj50Var instanceof jj50.b)) {
                    uhc.a();
                    return null;
                }
                bh7.a aVar2 = new bh7.a("Network Error");
                wwd0Var.getClass();
                wwd0Var.k(null, aVar2);
            }
            return Unit.a;
        }
    }

    public hh7(kb2 kb2Var, vb7 vb7Var, wb7 wb7Var, xb7 xb7Var, b5 b5Var, d dVar, fa7 fa7Var) {
        b5Var.getClass();
        dVar.getClass();
        fa7Var.getClass();
        this.a = kb2Var;
        this.b = vb7Var;
        this.c = wb7Var;
        this.d = xb7Var;
        this.e = b5Var;
        this.f = dVar;
        this.i = fa7Var;
        int i = 0;
        this.v = hwr.b(new dh7(this, i));
        this.w = hwr.b(new eh7(this, i));
        this.y = hwr.b(new yg2(this, 1));
        this.z = hwr.b(new fh7(this, 0));
        wwd0 wwd0VarA = xwd0.a(bh7.b.a);
        this.A = wwd0VarA;
        this.B = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(m2g.a);
        this.C = wwd0VarA2;
        this.D = e1i.b(wwd0VarA2);
        this.E = xwd0.a("");
        wwd0 wwd0VarA3 = xwd0.a(Boolean.TRUE);
        this.F = wwd0VarA3;
        this.G = e1i.b(wwd0VarA3);
        this.I = xwd0.a(new b(0));
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.J = b390VarB;
        this.K = e1i.a(b390VarB);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        wwd0 wwd0Var = this.A;
        wwd0Var.getClass();
        wwd0Var.k(null, bh7.b.a);
    }

    public final void x1(String str, String str2) {
        str.getClass();
        str2.getClass();
        wwd0 wwd0Var = this.E;
        wwd0Var.getClass();
        wwd0Var.k(null, str);
        hh hhVar = (hh) this.v.getValue();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        hhVar.getClass();
        strValueOf.getClass();
        kzh.d(new g1i(new or60(new gh(hhVar, str, strValueOf, null)), new a(str, null)), o8i0.d(this));
    }

    public static boolean y1(ChatListResponse chatListResponse) {
        JSONObject jSONObject = new JSONObject(chatListResponse.getJsonBody().toString());
        String str = lobGSRIlnSGJY.cXnHQbo;
        if (!jSONObject.has(str)) {
            return jSONObject.has("text") || jSONObject.has("json") || jSONObject.has("gif");
        }
        JSONObject jSONObject2 = new JSONObject(jSONObject.getString(str));
        return jSONObject2.has("text") || jSONObject2.has("json") || jSONObject2.has("gif");
    }
}
