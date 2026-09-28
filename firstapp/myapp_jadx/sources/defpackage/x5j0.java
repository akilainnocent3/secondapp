package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$welcomeRewardUiStatus$1", f = "WelcomeRewardViewModel.kt", l = {138, 144}, m = "invokeSuspend", v = 2)
public final class x5j0 extends tje0 implements jaj<NonFtdEngagement, Integer, Integer, String, v1b<? super r4j0.b>, Object> {
    public String a;
    public Map b;
    public int c;
    public /* synthetic */ NonFtdEngagement d;
    public /* synthetic */ int e;
    public /* synthetic */ int f;
    public /* synthetic */ String i;
    public final /* synthetic */ w4j0 v;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"l5j0", "Lcom/google/gson/reflect/TypeToken;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<Map<String, ? extends Boolean>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(5, v1bVar);
        this.v = w4j0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Map map;
        String str;
        NonFtdEngagement nonFtdEngagement = this.d;
        int i = this.e;
        int i2 = this.f;
        String str2 = this.i;
        y5b y5bVar = y5b.a;
        int i3 = this.c;
        w4j0 w4j0Var = this.v;
        if (i3 == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = w4j0Var.c;
            this.d = nonFtdEngagement;
            this.i = str2;
            this.e = i;
            this.f = i2;
            this.c = 1;
            obj = mgb0Var.getUserId(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i3 == 1) {
            uj50.b(obj);
        } else {
            if (i3 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = this.b;
            str = this.a;
            uj50.b(obj);
        }
        m4j0 m4j0Var = (m4j0) obj;
        boolean zG = Intrinsics.g(map.get(str), Boolean.TRUE);
        List<w5f0> list = m4j0Var.a;
        String str3 = m4j0Var.b;
        List<ds50> list2 = m4j0Var.c;
        dup dupVar = m4j0Var.d;
        List<tcf0> list3 = m4j0Var.e;
        UiText uiText = m4j0Var.f;
        UiText uiText2 = m4j0Var.g;
        list.getClass();
        str3.getClass();
        list2.getClass();
        dupVar.getClass();
        list3.getClass();
        return new r4j0.b(new m4j0(list, str3, list2, dupVar, list3, uiText, uiText2, zG));
        String str4 = (String) obj;
        Object obj2 = o2g.a;
        obj2.getClass();
        if (!StringsKt.U(str2)) {
            try {
                zi50.a aVar = zi50.b;
                bVar = w4j0Var.d.fromJson(str2, new a().getType());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            if (bVar != null) {
                obj2 = bVar;
            }
        }
        map = (Map) obj2;
        n4j0 n4j0Var = w4j0Var.y;
        this.d = null;
        this.i = null;
        this.a = str4;
        this.b = map;
        this.e = i;
        this.f = i2;
        this.c = 2;
        Object objE = n4j0Var.e(nonFtdEngagement, i, i2, this);
        if (objE != y5bVar) {
            obj = objE;
            str = str4;
            m4j0 m4j0Var2 = (m4j0) obj;
            boolean zG2 = Intrinsics.g(map.get(str), Boolean.TRUE);
            List<w5f0> list4 = m4j0Var2.a;
            String str5 = m4j0Var2.b;
            List<ds50> list5 = m4j0Var2.c;
            dup dupVar2 = m4j0Var2.d;
            List<tcf0> list6 = m4j0Var2.e;
            UiText uiText3 = m4j0Var2.f;
            UiText uiText4 = m4j0Var2.g;
            list4.getClass();
            str5.getClass();
            list5.getClass();
            dupVar2.getClass();
            list6.getClass();
            return new r4j0.b(new m4j0(list4, str5, list5, dupVar2, list6, uiText3, uiText4, zG2));
        }
        return y5bVar;
    }

    @Override // defpackage.jaj
    public final Object l(NonFtdEngagement nonFtdEngagement, Integer num, Integer num2, String str, v1b<? super r4j0.b> v1bVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        x5j0 x5j0Var = new x5j0(v1bVar, this.v);
        x5j0Var.d = nonFtdEngagement;
        x5j0Var.e = iIntValue;
        x5j0Var.f = iIntValue2;
        x5j0Var.i = str;
        return x5j0Var.invokeSuspend(Unit.a);
    }
}
