package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tkw extends x<ehw, elw> {
    public Function0<Unit> b;

    public final class a extends n.e<ehw> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(ehw ehwVar, ehw ehwVar2) {
            ehw ehwVar3 = ehwVar;
            ehw ehwVar4 = ehwVar2;
            ehwVar3.getClass();
            ehwVar4.getClass();
            return Intrinsics.g(ehwVar3, ehwVar4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(ehw ehwVar, ehw ehwVar2) {
            ehw ehwVar3 = ehwVar;
            ehw ehwVar4 = ehwVar2;
            ehwVar3.getClass();
            ehwVar4.getClass();
            return Intrinsics.g(ehwVar3.a, ehwVar4.a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        elw elwVar = (elw) d0Var;
        elwVar.getClass();
        ehw item = getItem(i);
        item.getClass();
        ehw ehwVar = item;
        CheckBox checkBox = elwVar.a.a;
        checkBox.setTag(ehwVar.a);
        UiText uiText = ehwVar.b;
        Context context = checkBox.getContext();
        context.getClass();
        checkBox.setText(uiText.e(context));
        checkBox.setChecked(ehwVar.c);
        checkBox.setEnabled(ehwVar.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.spr_multi_select_item_view, viewGroup, false);
        if (viewA != null) {
            return new elw(new uid0((CheckBox) viewA), new qkw(this));
        }
        bmy.a("rootView");
        return null;
    }
}
