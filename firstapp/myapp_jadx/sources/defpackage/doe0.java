package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.common.presentation.widget.AssetLabelTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class doe0 extends x<aoe0, b> {
    public static final a f = new a();
    public final String b;
    public final jaf c;
    public final cc20 d;
    public final joe0 e;

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
        public final f3p a;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[aoe0.b.a.values().length];
                try {
                    aoe0.b.a.C0082a c0082a = aoe0.b.a.b;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    aoe0.b.a.C0082a c0082a2 = aoe0.b.a.b;
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    aoe0.b.a.C0082a c0082a3 = aoe0.b.a.b;
                    iArr[4] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public b(f3p f3pVar) {
            super(f3pVar.a);
            this.a = f3pVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe0(String str, jaf jafVar, cc20 cc20Var, joe0 joe0Var) {
        super(f);
        str.getClass();
        this.b = str;
        this.c = jafVar;
        this.d = cc20Var;
        this.e = joe0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        boolean z;
        String str;
        String strA;
        b bVar = (b) d0Var;
        bVar.getClass();
        final aoe0 item = getItem(i);
        item.getClass();
        final sf1 sf1Var = new sf1(this, 1);
        String str2 = this.b;
        str2.getClass();
        final cc20 cc20Var = this.d;
        cc20Var.getClass();
        joe0 joe0Var = this.e;
        joe0Var.getClass();
        final f3p f3pVar = bVar.a;
        boolean z2 = item.b() && !boe0.c(item);
        AssetLabelTextView assetLabelTextView = f3pVar.f;
        AppCompatImageView appCompatImageView = f3pVar.b;
        ConstraintLayout constraintLayout = f3pVar.a;
        AppCompatImageView appCompatImageView2 = f3pVar.e;
        TextView textView = f3pVar.w;
        View view = f3pVar.d;
        AppCompatImageView appCompatImageView3 = f3pVar.i;
        AppCompatImageView appCompatImageView4 = f3pVar.v;
        assetLabelTextView.setVisibility(8);
        if (item.a()) {
            appCompatImageView2.setVisibility(8);
            view.setVisibility(0);
            appCompatImageView4.setVisibility(0);
            appCompatImageView4.setImageResource(z2 ? R.drawable.icon_radio_checked : R.drawable.icon_radio_unchecked);
            appCompatImageView.setVisibility(8);
            z = z2;
        } else {
            z = z2;
            appCompatImageView2.setVisibility(0);
            view.setVisibility(8);
            appCompatImageView4.setImageResource(R.drawable.ic_check);
            appCompatImageView4.setVisibility(item.b() ? 0 : 4);
            if (item instanceof aoe0.c) {
                appCompatImageView.setVisibility(0);
            }
        }
        if (item instanceof aoe0.g) {
            String strA2 = vtu.a(((aoe0.g) item).b);
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setText(str2 + " " + strA2);
            appCompatImageView2.setImageResource(R.drawable.ic_mobile_money);
            appCompatImageView2.setColorFilter(constraintLayout.getContext().getColor(R.color.text_type1_secondary));
            appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER);
        } else if (item instanceof aoe0.b) {
            aoe0.b bVar2 = (aoe0.b) item;
            String strConcat = bVar2.b;
            if (strConcat != null) {
                str = "--";
                if (strConcat.length() > 16) {
                    strConcat = wae0.K(16, strConcat).concat("...");
                }
            } else {
                str = "--";
                strConcat = str;
            }
            textView.setTypeface(textView.getTypeface(), 0);
            j7g j7gVar = new j7g();
            j7gVar.b(strConcat);
            j7gVar.a(" ");
            String str3 = bVar2.d;
            j7gVar.a((str3 == null || (strA = fu5.a("\\d(?=\\d{4})", str3, "*")) == null) ? str : strA);
            textView.setText(j7gVar);
            appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            joe0Var.invoke(bVar2.c, appCompatImageView2);
            int color = constraintLayout.getContext().getColor(R.color.text_type1_secondary);
            aoe0.b.a aVar = bVar2.j;
            int i2 = aVar == null ? -1 : b.a.a[aVar.ordinal()];
            if (i2 == 1) {
                appCompatImageView2.setColorFilter(color, PorterDuff.Mode.ADD);
                textView.setEnabled(false);
                assetLabelTextView.i(oy0.c);
            } else if (i2 == 2) {
                appCompatImageView2.setColorFilter(color, PorterDuff.Mode.ADD);
                textView.setEnabled(false);
                assetLabelTextView.i(oy0.e);
            } else if (i2 != 3) {
                appCompatImageView2.setColorFilter((ColorFilter) null);
                textView.setEnabled(true);
                assetLabelTextView.setVisibility(8);
            } else {
                appCompatImageView2.setColorFilter(color, PorterDuff.Mode.ADD);
                textView.setEnabled(false);
                assetLabelTextView.i(oy0.d);
            }
        } else {
            textView.setTypeface(textView.getTypeface(), 0);
            textView.setText(item.getId().toString());
        }
        if (boe0.c(item)) {
            assetLabelTextView.i(oy0.b);
        } else if ((item.a() && z) || (!item.a() && (item instanceof aoe0.e) && ((aoe0.e) item).isDefault())) {
            assetLabelTextView.i(oy0.a);
        }
        if (boe0.c(item)) {
            constraintLayout.setBackgroundResource(R.color.background_type1_primary);
            appCompatImageView3.setVisibility(0);
            textView.setTextColor(constraintLayout.getContext().getColor(R.color.text_disable_type1_primary));
        } else {
            constraintLayout.setBackgroundResource(android.R.color.transparent);
            textView.setTextColor(constraintLayout.getContext().getColor(R.color.text_type1_primary));
            appCompatImageView3.setVisibility(8);
        }
        appCompatImageView3.setOnClickListener(new View.OnClickListener() { // from class: eoe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cc20Var.invoke(f3pVar.i);
            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: foe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                sf1Var.invoke(new une0.b(item));
            }
        });
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: goe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                sf1Var.invoke(new une0.a(item));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_switch_payment_v2, viewGroup, false);
        int i2 = R.id.delete_btn;
        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.delete_btn, viewInflate);
        if (appCompatImageView != null) {
            i2 = R.id.diver_line;
            View viewA = h5e.a(R.id.diver_line, viewInflate);
            if (viewA != null) {
                i2 = R.id.editing_select_icon_space;
                View viewA2 = h5e.a(R.id.editing_select_icon_space, viewInflate);
                if (viewA2 != null) {
                    i2 = R.id.guideline_begin;
                    if (((Guideline) h5e.a(R.id.guideline_begin, viewInflate)) != null) {
                        i2 = R.id.guideline_end;
                        if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                            i2 = R.id.icon_image_view;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.icon_image_view, viewInflate);
                            if (appCompatImageView2 != null) {
                                i2 = R.id.label;
                                AssetLabelTextView assetLabelTextView = (AssetLabelTextView) h5e.a(R.id.label, viewInflate);
                                if (assetLabelTextView != null) {
                                    i2 = R.id.label_tooltip;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.label_tooltip, viewInflate);
                                    if (appCompatImageView3 != null) {
                                        i2 = R.id.select_icon_image_view;
                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.select_icon_image_view, viewInflate);
                                        if (appCompatImageView4 != null) {
                                            i2 = R.id.title_text;
                                            TextView textView = (TextView) h5e.a(R.id.title_text, viewInflate);
                                            if (textView != null) {
                                                return new b(new f3p((ConstraintLayout) viewInflate, appCompatImageView, viewA, viewA2, appCompatImageView2, assetLabelTextView, appCompatImageView3, appCompatImageView4, textView));
                                            }
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
