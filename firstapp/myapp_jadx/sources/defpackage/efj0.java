package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.WinningPopupMyEventsHandlerImpl$init$1", f = "WinningPopupMyEventsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class efj0 extends tje0 implements gaj<v1f, Boolean, v1b<? super mfj0>, Object> {
    public /* synthetic */ v1f a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ v7k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efj0(v7k v7kVar, v1b<? super efj0> v1bVar) {
        super(3, v1bVar);
        this.c = v7kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v1f v1fVar, Boolean bool, v1b<? super mfj0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        efj0 efj0Var = new efj0(this.c, v1bVar);
        efj0Var.a = v1fVar;
        efj0Var.b = zBooleanValue;
        return efj0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVarB;
        Object qbj0Var;
        v1f v1fVar = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (v1fVar == null) {
            return null;
        }
        ArrayList arrayList = v1fVar.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        u1f u1fVar = v1fVar.d;
        eej0 eej0Var = new eej0(u1fVar.c, u1fVar.f, u1fVar.a, u1fVar.b, u1fVar.d, u1fVar.e);
        if (z) {
            int i = 10;
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                t1f t1fVar = (t1f) obj2;
                t1fVar.getClass();
                int i4 = t1fVar.a() ? R.drawable.ic_selection_status_win : R.drawable.ic_selection_status_lost;
                if (t1fVar instanceof t1f.b) {
                    t1f.b bVar = (t1f.b) t1fVar;
                    UiText uiText = bVar.b;
                    String str = bVar.d;
                    Iterator it = b.k(vch0.d(bVar.e), new StringUiText(" @"), vch0.d(bVar.c)).iterator();
                    if (!it.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((UiText) next).h((UiText) it.next());
                    }
                    qbj0Var = new rbj0(i4, uiText, (UiText) next, str);
                } else {
                    if (!(t1fVar instanceof t1f.a)) {
                        uhc.a();
                        return null;
                    }
                    t1f.a aVar = (t1f.a) t1fVar;
                    UiText uiText2 = aVar.b;
                    StringUiText stringUiText = vch0.a;
                    ResourceUiText resourceUiText = new ResourceUiText(R.string.page_instant_virtual__bet_builder);
                    StringUiText stringUiText2 = new StringUiText(" @");
                    StringUiText stringUiTextD = vch0.d(aVar.c);
                    UiText[] uiTextArr = new UiText[3];
                    uiTextArr[i2] = resourceUiText;
                    uiTextArr[1] = stringUiText2;
                    uiTextArr[2] = stringUiTextD;
                    Iterator it2 = b.k(uiTextArr).iterator();
                    if (!it2.hasNext()) {
                        zkh.a("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next2 = it2.next();
                    while (it2.hasNext()) {
                        next2 = ((UiText) next2).h((UiText) it2.next());
                    }
                    UiText uiText3 = (UiText) next2;
                    ArrayList arrayList3 = aVar.d;
                    ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, i));
                    int size2 = arrayList3.size();
                    int i5 = i2;
                    while (i5 < size2) {
                        Object obj3 = arrayList3.get(i5);
                        i5++;
                        t1f.a.C1111a c1111a = (t1f.a.C1111a) obj3;
                        arrayList4.add(new qbj0.a(c1111a.b, c1111a.a));
                    }
                    qbj0Var = new qbj0(i4, uiText2, uiText3, a4h.b(arrayList4));
                }
                arrayList2.add(qbj0Var);
                i = 10;
                i2 = 0;
            }
            qcnVarB = a4h.b(arrayList2);
        } else {
            qcnVarB = n1a0.c;
        }
        return new mfj0(eej0Var, qcnVarB, z ? R.drawable.spr_ic_keyboard_arrow_up_black_24dp : R.drawable.spr_ic_keyboard_arrow_down_black_24dp);
    }
}
