package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ab8 ab8Var;
        LinearLayoutCompat linearLayoutCompat;
        PagingFetchType type;
        ab8.a aVar;
        ab8.a aVar2;
        ab8 ab8Var2;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        Context context;
        final e activity;
        final Context context2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.e) ((tng0) obj2)).b;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar3 = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_COMMON);
                    aVar4.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return Unit.a;
            case 1:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                ((View) obj).getClass();
                ha7 ha7Var = (ha7) chatActivity.a;
                if (ha7Var != null) {
                    ha7Var.e.setClickable(false);
                }
                ha7 ha7Var2 = (ha7) chatActivity.a;
                if (ha7Var2 != null) {
                    ha7Var2.e.setAlpha(0.5f);
                }
                Intent intent = new Intent("cashoutCall");
                intent.putExtra(dqvOSm.KpRI, 2);
                fdt.a(chatActivity).c(intent);
                return Unit.a;
            default:
                final fgb fgbVar = (fgb) obj2;
                final LoadingState loadingState = (LoadingState) obj;
                int i3 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        ab8 ab8Var3 = fgbVar.w1;
                        if (ab8Var3 != null && (relativeLayout2 = ab8Var3.v) != null && ab8Var3.I < 0) {
                            relativeLayout2.setVisibility(0);
                        }
                    } else {
                        if (i3 != 3) {
                            uhc.a();
                            return null;
                        }
                        xbg xbgVar = fgbVar.G0;
                        if (!(xbgVar != null ? xbgVar.isShowing() : false) && (context = fgbVar.getContext()) != null && context.getApplicationContext() != null && (activity = fgbVar.getActivity()) != null && (context2 = fgbVar.getContext()) != null) {
                            ab8 ab8Var4 = fgbVar.w1;
                            if (ab8Var4 != null) {
                                ab8Var4.dismiss();
                            }
                            gvi gviVar = fgbVar.z;
                            if (gviVar != null) {
                                ComposeView composeView = gviVar.J;
                                composeView.setViewCompositionStrategy(u6i0.c.a);
                                composeView.setContent(new op8(-410008807, new Function2() { // from class: wab
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
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar5 = (a) obj3;
                                        int iIntValue = ((Integer) obj4).intValue();
                                        if (aVar5.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            q8b q8bVar = q8b.d;
                                            final fgb fgbVar2 = fgbVar;
                                            String str = (String) ((x5a0) fgbVar2.c1().D).getValue();
                                            ResultWrapper.GenericError error = loadingState.getError();
                                            context2.getColor(R.color.sh_error_btn_color);
                                            cj5 cj5VarU0 = fgbVar2.U0();
                                            boolean zA = aVar5.A(fgbVar2);
                                            Object objY = aVar5.y();
                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                            if (zA || objY == c0042a) {
                                                objY = new Function0() { // from class: xbb
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        fgbVar2.M0();
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar5.r(objY);
                                            }
                                            Function0 function0 = (Function0) objY;
                                            boolean zA2 = aVar5.A(fgbVar2);
                                            Object objY2 = aVar5.y();
                                            if (zA2 || objY2 == c0042a) {
                                                objY2 = new ybb(fgbVar2, 0);
                                                aVar5.r(objY2);
                                            }
                                            Function0 function1 = (Function0) objY2;
                                            Object objY3 = aVar5.y();
                                            if (objY3 == c0042a) {
                                                objY3 = new zbb();
                                                aVar5.r(objY3);
                                            }
                                            Function0 function2 = (Function0) objY3;
                                            Object objY4 = aVar5.y();
                                            if (objY4 == c0042a) {
                                                objY4 = new acb();
                                                aVar5.r(objY4);
                                            }
                                            Function1 function3 = (Function1) objY4;
                                            boolean zA3 = aVar5.A(fgbVar2);
                                            Object objY5 = aVar5.y();
                                            if (zA3 || objY5 == c0042a) {
                                                objY5 = new Function1() { // from class: bcb
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj5) {
                                                        String str2 = (String) obj5;
                                                        str2.getClass();
                                                        fgbVar2.N0(str2);
                                                        return Unit.a;
                                                    }
                                                };
                                                aVar5.r(objY5);
                                            }
                                            Function1 function4 = (Function1) objY5;
                                            Object objY6 = aVar5.y();
                                            if (objY6 == c0042a) {
                                                objY6 = new ta2(1);
                                                aVar5.r(objY6);
                                            }
                                            q8bVar.a(activity, str, error, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar5, 14352384);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        }
                    }
                } else if (loadingState.getData() != null) {
                    ab8 ab8Var5 = fgbVar.w1;
                    if (ab8Var5 != null && (relativeLayout = ab8Var5.v) != null && ab8Var5.I < 0) {
                        relativeLayout.setVisibility(8);
                    }
                    List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                    if ((list != null ? list.size() : 0) > 0) {
                        ab8Var = fgbVar.w1;
                        if (ab8Var != null) {
                            linearLayoutCompat = ab8Var.y;
                            if (linearLayoutCompat != null) {
                                linearLayoutCompat.setVisibility(8);
                            }
                            ab8Var.b().setVisibility(0);
                        }
                    } else {
                        Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                        if ((total != null ? total.intValue() : 0) > 0 || (ab8Var2 = fgbVar.w1) == null || ab8Var2.b().getChildCount() != 0) {
                            ab8Var = fgbVar.w1;
                            if (ab8Var != null) {
                                linearLayoutCompat = ab8Var.y;
                                if (linearLayoutCompat != null) {
                                    linearLayoutCompat.setVisibility(8);
                                }
                                ab8Var.b().setVisibility(0);
                            }
                        } else {
                            ab8 ab8Var6 = fgbVar.w1;
                            if (ab8Var6 != null) {
                                LinearLayoutCompat linearLayoutCompat2 = ab8Var6.y;
                                if (linearLayoutCompat2 != null) {
                                    linearLayoutCompat2.setVisibility(0);
                                }
                                ab8Var6.b().setVisibility(0);
                            }
                        }
                    }
                    ab8 ab8Var7 = fgbVar.w1;
                    if (ab8Var7 != null) {
                        Object data = ((HTTPResponse) loadingState.getData()).getData();
                        ArrayList arrayList = data instanceof ArrayList ? (ArrayList) data : null;
                        Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                        PagingState pagingStateD = fgbVar.T0().c.d();
                        int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                        PagingState pagingStateD2 = fgbVar.T0().c.d();
                        int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                        PagingState pagingStateD3 = fgbVar.T0().c.d();
                        if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                            type = PagingFetchType.VIEW_MORE;
                        }
                        ArrayList arrayList2 = ab8Var7.E;
                        ArrayList arrayList3 = ab8Var7.D;
                        type.getClass();
                        if (arrayList != null) {
                            arrayList3.addAll(arrayList);
                            arrayList2.addAll(arrayList);
                        }
                        ab8Var7.I = offset;
                        ab8Var7.H = limit;
                        int size = arrayList != null ? arrayList.size() : 0;
                        if (type == PagingFetchType.VIEW_MORE && ((aVar2 = ab8Var7.J) == ab8.a.a || aVar2 == ab8.a.b)) {
                            ab8.a aVar5 = (total2 == null || total2.intValue() <= arrayList3.size()) ? ab8.a.c : ab8.a.b;
                            ab8Var7.J = aVar5;
                            ab8Var7.z = arrayList3.size();
                        }
                        if (type == PagingFetchType.ARCHIVE_MORE && ((aVar = ab8Var7.J) == ab8.a.a || aVar == ab8.a.b)) {
                            ab8.a aVar6 = ab8.a.c;
                            ab8Var7.J = aVar6;
                            if (total2 != null && size >= 15) {
                                aVar6 = ab8.a.b;
                            }
                            ab8Var7.K = aVar6;
                            int size2 = arrayList3.size();
                            int i4 = ab8Var7.H;
                            ab8Var7.z = size2 - i4;
                            ab8Var7.I = i4 - 15;
                            ab8Var7.H = 15;
                        }
                        ab8.a aVar7 = ab8Var7.J;
                        ab8.a aVar8 = ab8.a.c;
                        if (aVar7 == aVar8) {
                            ab8.a aVar9 = ab8Var7.K;
                            ab8.a aVar10 = ab8.a.b;
                            if (aVar9 == aVar10) {
                                if (total2 == null || total2.intValue() <= arrayList3.size() - ab8Var7.z) {
                                    aVar10 = aVar8;
                                }
                                ab8Var7.K = aVar10;
                            }
                        }
                        if (ab8Var7.J == aVar8 && ab8Var7.K == ab8.a.a) {
                            ab8Var7.I = -15;
                            ab8Var7.H = 15;
                            ab8Var7.K = ab8.a.b;
                        }
                        if (arrayList != null) {
                            RecyclerView.f adapter = ab8Var7.b().getAdapter();
                            adapter.getClass();
                            zo2 zo2Var = (zo2) adapter;
                            ArrayList arrayListC0 = CollectionsKt.C0(arrayList2);
                            ab8.a aVar11 = ab8Var7.J;
                            ab8.a aVar12 = ab8.a.b;
                            ej5.c(zo2Var.d, null, null, new cp2(arrayListC0, aVar11 == aVar12, ab8Var7.K == aVar12, zo2Var, null), 3);
                        }
                        RecyclerView.f adapter2 = ab8Var7.b().getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyDataSetChanged();
                        }
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                }
                return Unit.a;
        }
    }
}
