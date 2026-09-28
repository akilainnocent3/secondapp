package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nne0 extends x<aoe0, b> {
    public static final a d = new a();
    public final gbn b;
    public final rb20 c;

    public static final class a extends n.e<aoe0> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(aoe0 aoe0Var, aoe0 aoe0Var2) {
            aoe0 aoe0Var3 = aoe0Var;
            aoe0 aoe0Var4 = aoe0Var2;
            aoe0Var3.getClass();
            aoe0Var4.getClass();
            return Intrinsics.g(aoe0Var3, aoe0Var4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(aoe0 aoe0Var, aoe0 aoe0Var2) {
            aoe0 aoe0Var3 = aoe0Var;
            aoe0 aoe0Var4 = aoe0Var2;
            aoe0Var3.getClass();
            aoe0Var4.getClass();
            return aoe0Var3 == aoe0Var4;
        }
    }

    public static final class b extends RecyclerView.d0 {
        public final e3p a;
        public final gbn b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3p e3pVar, gbn gbnVar) {
            super(e3pVar.a);
            gbnVar.getClass();
            this.a = e3pVar;
            this.b = gbnVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nne0(gbn gbnVar, rb20 rb20Var) {
        super(d);
        gbnVar.getClass();
        this.b = gbnVar;
        this.c = rb20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String strA;
        b bVar = (b) d0Var;
        bVar.getClass();
        aoe0 item = getItem(i);
        item.getClass();
        jf1 jf1Var = new jf1(this, 3);
        gbn gbnVar = bVar.b;
        e3p e3pVar = bVar.a;
        ImageView imageView = e3pVar.b;
        ConstraintLayout constraintLayout = e3pVar.a;
        ImageView imageView2 = e3pVar.c;
        TextView textView = e3pVar.f;
        TextView textView2 = e3pVar.i;
        ImageView imageView3 = e3pVar.e;
        imageView.setVisibility(item.b() ? 0 : 4);
        imageView2.setVisibility(item.a() ? 0 : 8);
        textView.setVisibility(8);
        textView2.setVisibility(0);
        imageView3.setVisibility(0);
        int i2 = 1;
        constraintLayout.setOnClickListener(new xl60(i2, jf1Var, item));
        imageView2.setVisibility(item.a() ? 0 : 8);
        imageView2.setOnClickListener(new yl60(i2, jf1Var, item));
        textView2.setTypeface(textView2.getTypeface(), 1);
        if (item instanceof aoe0.h) {
            aoe0.h hVar = (aoe0.h) item;
            textView2.setText(hVar.b);
            String str = hVar.c;
            if (str != null) {
                gbnVar.e(str, imageView3, R.drawable.icon_default, R.drawable.icon_default);
                return;
            } else {
                imageView3.setImageResource(R.drawable.icon_default);
                return;
            }
        }
        String str2 = "--";
        if (item instanceof aoe0.a) {
            aoe0.a aVar = (aoe0.a) item;
            String str3 = aVar.b;
            textView2.setText(str3 != null ? str3 : "--");
            textView2.setTypeface(Typeface.DEFAULT);
            String str4 = aVar.c;
            if (str4 != null) {
                gbnVar.e(str4, imageView3, R.drawable.icon_default, R.drawable.icon_default);
                return;
            } else {
                imageView3.setImageResource(R.drawable.icon_default);
                return;
            }
        }
        if (!(item instanceof aoe0.b)) {
            if (item instanceof aoe0.f) {
                textView.setVisibility(0);
                UiText uiText = ((aoe0.f) item).d;
                Context context = constraintLayout.getContext();
                context.getClass();
                uiText.getClass();
                textView.setText(uiText.e(context).toString());
                textView2.setVisibility(8);
                imageView3.setVisibility(8);
                constraintLayout.setOnClickListener(new e440());
                return;
            }
            return;
        }
        aoe0.b bVar2 = (aoe0.b) item;
        String str5 = bVar2.b;
        String str6 = bVar2.d;
        if (str6 != null && (strA = fu5.a("\\d(?=\\d{4})", str6, "*")) != null) {
            str2 = strA;
        }
        textView2.setText(str5 + "(" + str2 + ")");
        String str7 = bVar2.c;
        if (str7 != null) {
            gbnVar.e(str7, imageView3, R.drawable.icon_default, R.drawable.icon_default);
        } else {
            imageView3.setImageResource(R.drawable.icon_default);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_switch_payment, viewGroup, false);
        int i2 = R.id.check;
        ImageView imageView = (ImageView) h5e.a(R.id.check, viewInflate);
        if (imageView != null) {
            i2 = R.id.delete_button;
            ImageView imageView2 = (ImageView) h5e.a(R.id.delete_button, viewInflate);
            if (imageView2 != null) {
                i2 = R.id.diver_line;
                View viewA = h5e.a(R.id.diver_line, viewInflate);
                if (viewA != null) {
                    i2 = R.id.guideline_begin;
                    if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                        i2 = R.id.guideline_end;
                        if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                            i2 = R.id.icon_image_view;
                            ImageView imageView3 = (ImageView) h5e.a(R.id.icon_image_view, viewInflate);
                            if (imageView3 != null) {
                                i2 = R.id.label_text_view;
                                TextView textView = (TextView) h5e.a(R.id.label_text_view, viewInflate);
                                if (textView != null) {
                                    i2 = R.id.primary_info_text_view;
                                    TextView textView2 = (TextView) h5e.a(R.id.primary_info_text_view, viewInflate);
                                    if (textView2 != null) {
                                        i2 = R.id.secondary_info_text_view;
                                        if (((TextView) h5e.a(R.id.secondary_info_text_view, viewInflate)) != null) {
                                            return new b(new e3p((ConstraintLayout) viewInflate, imageView, imageView2, viewA, imageView3, textView, textView2), this.b);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
