package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class qy4 extends x<sy4, a> {
    public final Function2<String, String, Unit> b;

    public final class a extends RecyclerView.d0 {
        public final e2p a;
        public final ly4 b;

        public a(e2p e2pVar, ly4 ly4Var) {
            super(e2pVar.a);
            this.a = e2pVar;
            this.b = ly4Var;
            e2pVar.c.setOnClickListener(new View.OnClickListener() { // from class: py4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qy4.a aVar = this.a;
                    aVar.b.invoke(Integer.valueOf(aVar.getBindingAdapterPosition()));
                }
            });
        }
    }

    public qy4(Function2 function2) {
        super(new my4());
        this.b = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        boolean z;
        a aVar = (a) d0Var;
        aVar.getClass();
        sy4 item = getItem(i);
        item.getClass();
        sy4 sy4Var = item;
        e2p e2pVar = aVar.a;
        final qy4 qy4Var = qy4.this;
        ImageView imageView = e2pVar.b;
        TextView textView = e2pVar.d;
        TextView textView2 = e2pVar.e;
        String str = sy4Var.e;
        final CharSequence charSequence = sy4Var.k.a;
        final CharSequence charSequence2 = sy4Var.j.a;
        m9n m9nVarA = qw90.a(imageView.getContext());
        nan.a aVar2 = new nan.a(imageView.getContext());
        aVar2.c = str;
        abn.f(aVar2, imageView);
        Context context = e2pVar.a.getContext();
        context.getClass();
        Drawable drawableC = s0b.c(context, R.drawable.ic_codehub_default_league_logo, null, null, 6);
        u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
        aVar2.d(u7nVarB);
        aVar2.b(u7nVarB);
        m9nVarA.a(aVar2.a());
        TextView textView3 = e2pVar.v;
        StringUiText stringUiText = sy4Var.f;
        aVar.itemView.getContext().getClass();
        textView3.setText(stringUiText.a);
        TextView textView4 = e2pVar.i;
        StringUiText stringUiText2 = sy4Var.g;
        aVar.itemView.getContext().getClass();
        textView4.setText(stringUiText2.a);
        TextView textView5 = e2pVar.f;
        StringUiText stringUiText3 = sy4Var.h;
        aVar.itemView.getContext().getClass();
        textView5.setText(stringUiText3.a);
        TextView textView6 = e2pVar.w;
        UiText uiText = sy4Var.i;
        Context context2 = aVar.itemView.getContext();
        context2.getClass();
        textView6.setText(uiText.e(context2));
        aVar.itemView.getContext().getClass();
        textView2.setText(charSequence2);
        aVar.itemView.getContext().getClass();
        textView.setText(charSequence);
        ImageView imageView2 = e2pVar.c;
        rz4 rz4Var = sy4Var.p;
        rz4Var.getClass();
        if (rz4Var instanceof rz4.a) {
            z = ((rz4.a) rz4Var).b;
        } else {
            if (!(rz4Var instanceof rz4.b)) {
                uhc.a();
                return;
            }
            z = false;
        }
        c8i0.o(imageView2, z);
        aVar.itemView.getContext().getClass();
        aVar.itemView.getContext().getClass();
        textView2.setOnClickListener(new View.OnClickListener(charSequence2, qy4Var) { // from class: ny4
            public final /* synthetic */ CharSequence a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringsKt.U(this.a);
            }
        });
        textView.setOnClickListener(new View.OnClickListener(charSequence, qy4Var) { // from class: oy4
            public final /* synthetic */ CharSequence a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringsKt.U(this.a);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new a(e2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), new ly4(this, 0));
    }
}
