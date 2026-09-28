package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tk2 extends RecyclerView.f<a> {
    public final ArrayList<DetailResponse.BetConfigList> a;
    public final Context b;
    public final RecyclerView c;
    public final ypa0 d;
    public wk2 e;
    public ok2 f;
    public int i;
    public boolean v;

    public final class a extends RecyclerView.d0 {
        public final wk2 a;
        public final /* synthetic */ tk2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tk2 tk2Var, wk2 wk2Var) {
            super(wk2Var.a);
            wk2Var.getClass();
            this.b = tk2Var;
            this.a = wk2Var;
        }
    }

    public tk2(ArrayList<DetailResponse.BetConfigList> arrayList, Context context, RecyclerView recyclerView, ypa0 ypa0Var) {
        ypa0Var.getClass();
        this.a = arrayList;
        this.b = context;
        this.c = recyclerView;
        this.d = ypa0Var;
        new ArrayList();
        this.i = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList<DetailResponse.BetConfigList> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final a aVar = (a) d0Var;
        aVar.getClass();
        ArrayList<DetailResponse.BetConfigList> arrayList = this.a;
        final DetailResponse.BetConfigList betConfigList = arrayList != null ? arrayList.get(i) : null;
        if (betConfigList != null) {
            pfd pfdVar = fse.a;
            j1b j1bVarA = w5b.a(gku.a);
            final tk2 tk2Var = aVar.b;
            ej5.c(j1bVarA, null, null, new rk2(aVar, tk2Var, null), 3);
            wk2 wk2Var = aVar.a;
            TextView textView = wk2Var.f;
            ImageView imageView = wk2Var.d;
            ConstraintLayout constraintLayout = wk2Var.e;
            ImageView imageView2 = wk2Var.c;
            ConstraintLayout constraintLayout2 = wk2Var.a;
            textView.setText("x" + ((int) betConfigList.getPayout()));
            wk2Var.f.setTextColor(tk2Var.b.getColor(betConfigList.getColorCode()));
            String strValueOf = String.valueOf(betConfigList.getColorCode());
            strValueOf.getClass();
            int i2 = Integer.parseInt(strValueOf);
            if (i2 != R.color.white) {
                imageView2.setImageTintList(ColorStateList.valueOf(imageView2.getContext().getColor(i2)));
            }
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: qk2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tk2 tk2Var2 = this.a;
                    DetailResponse.BetConfigList betConfigList2 = betConfigList;
                    tk2.a aVar2 = aVar;
                    try {
                        if (tk2Var2.v) {
                            ok2 ok2Var = tk2Var2.f;
                            if (ok2Var != null) {
                                ok2Var.invoke(-1);
                                return;
                            } else {
                                Intrinsics.n("betConfigListener");
                                throw null;
                            }
                        }
                        if (tk2Var2.i != betConfigList2.getId()) {
                            ok2 ok2Var2 = tk2Var2.f;
                            if (ok2Var2 == null) {
                                Intrinsics.n("betConfigListener");
                                throw null;
                            }
                            ok2Var2.invoke(Integer.valueOf(betConfigList2.getId()));
                            ArrayList<DetailResponse.BetConfigList> arrayList2 = tk2Var2.a;
                            if (arrayList2 != null) {
                                int size = arrayList2.size();
                                int i3 = 0;
                                int i4 = 0;
                                while (i4 < size) {
                                    DetailResponse.BetConfigList betConfigList3 = arrayList2.get(i4);
                                    i4++;
                                    int i5 = i3 + 1;
                                    if (i3 < 0) {
                                        b.q();
                                        throw null;
                                    }
                                    RecyclerView recyclerView = tk2Var2.c;
                                    RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i3));
                                    d0VarQ.getClass();
                                    ((tk2.a) d0VarQ).a.d.setImageDrawable(null);
                                    i3 = i5;
                                }
                            }
                            ypa0 ypa0Var = tk2Var2.d;
                            String string = tk2Var2.b.getString(R.string.select_multiplier);
                            string.getClass();
                            ypa0Var.A1(0L, string);
                            wz.a("MultiplierSelected", "Spin Match", String.valueOf((int) betConfigList2.getPayout()));
                            pfd pfdVar2 = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new sk2(aVar2, tk2Var2, null), 3);
                            tk2Var2.i = betConfigList2.getId();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = constraintLayout2.getLayoutParams().width - ((int) (((double) constraintLayout2.getLayoutParams().width) / 2.8d));
            }
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = constraintLayout2.getLayoutParams().width - ((int) (((double) constraintLayout2.getLayoutParams().width) / 2.8d));
            }
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = constraintLayout2.getLayoutParams().width - (constraintLayout2.getLayoutParams().width / 30);
            }
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = constraintLayout2.getLayoutParams().width - (constraintLayout2.getLayoutParams().width / 30);
            }
            wk2Var.b.getLayoutParams().width = (int) (((double) constraintLayout2.getLayoutParams().width) / 2.2d);
            constraintLayout.setClickable(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.bet_config_list, viewGroup, false);
        int i2 = R.id.bet_amount_match;
        if (((TextView) h5e.a(R.id.bet_amount_match, viewA)) != null) {
            i2 = R.id.chip_image;
            if (((ImageView) h5e.a(R.id.chip_image, viewA)) != null) {
                i2 = R.id.chip_layout;
                if (((ConstraintLayout) h5e.a(R.id.chip_layout, viewA)) != null) {
                    i2 = R.id.crown;
                    ImageView imageView = (ImageView) h5e.a(R.id.crown, viewA);
                    if (imageView != null) {
                        i2 = R.id.fbg_chip_layout;
                        if (((ConstraintLayout) h5e.a(R.id.fbg_chip_layout, viewA)) != null) {
                            i2 = R.id.iv_fbg_sm;
                            if (((ImageView) h5e.a(R.id.iv_fbg_sm, viewA)) != null) {
                                i2 = R.id.match;
                                ImageView imageView2 = (ImageView) h5e.a(R.id.match, viewA);
                                if (imageView2 != null) {
                                    i2 = R.id.match_glow;
                                    ImageView imageView3 = (ImageView) h5e.a(R.id.match_glow, viewA);
                                    if (imageView3 != null) {
                                        i2 = R.id.parentLayout;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parentLayout, viewA);
                                        if (constraintLayout != null) {
                                            i2 = R.id.payout_amount;
                                            TextView textView = (TextView) h5e.a(R.id.payout_amount, viewA);
                                            if (textView != null) {
                                                i2 = R.id.tv_fbg_sm;
                                                if (((TextView) h5e.a(R.id.tv_fbg_sm, viewA)) != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewA;
                                                    this.e = new wk2(constraintLayout2, imageView, imageView2, imageView3, constraintLayout, textView);
                                                    ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                                                    layoutParams.width = (int) (((double) viewGroup.getMeasuredWidth()) / 4.5d);
                                                    wk2 wk2Var = this.e;
                                                    if (wk2Var == null) {
                                                        Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    wk2Var.a.setLayoutParams(layoutParams);
                                                    wk2 wk2Var2 = this.e;
                                                    if (wk2Var2 != null) {
                                                        return new a(this, wk2Var2);
                                                    }
                                                    Intrinsics.n("binding");
                                                    throw null;
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
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
