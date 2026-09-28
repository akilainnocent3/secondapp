package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.BetChipItem;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public class cl7 extends RecyclerView.f<RecyclerView.d0> {
    public final RecyclerView a;
    public final Context b;
    public final ArrayList<BetChipItem> c;
    public Function1<? super Double, Unit> d;
    public Function1<? super Boolean, Unit> e;
    public boolean f;

    public static final class a extends RecyclerView.d0 {
        public final ConstraintLayout a;
        public final ImageView b;
        public final Animation c;
        public final Animation d;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.ic_fbg_chip);
            viewFindViewById.getClass();
            this.a = (ConstraintLayout) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.ic_fbg_chip_icon);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.sg_chip_press);
            animationLoadAnimation.getClass();
            this.c = animationLoadAnimation;
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.sg_chip_release);
            animationLoadAnimation2.getClass();
            this.d = animationLoadAnimation2;
        }
    }

    public cl7(Context context, RecyclerView recyclerView, ArrayList arrayList) {
        recyclerView.getClass();
        context.getClass();
        arrayList.getClass();
        this.a = recyclerView;
        this.b = context;
        this.c = arrayList;
        this.f = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.c.get(i).getBetAmount() == -1.0d ? 1 : 0;
    }

    public String i(double d) {
        return String.format(SportyGamesManager.locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }

    public final void j(int i, boolean z) {
        ArrayList<BetChipItem> arrayList = this.c;
        arrayList.get(i).isEnabled();
        arrayList.get(i).setEnabled(z);
        try {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                BetChipItem betChipItem = arrayList.get(i3);
                i3++;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                String betAmountDisplay = Double.valueOf(arrayList.get(i).getBetAmount() % 1.0d).equals(Double.valueOf(0.0d)) ? arrayList.get(i).getBetAmountDisplay() : i(arrayList.get(i).getBetAmount());
                RecyclerView recyclerView = this.a;
                RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i2));
                d0VarQ.getClass();
                el7 el7Var = (el7) d0VarQ;
                ConstraintLayout constraintLayout = el7Var.b;
                if (el7Var.c.getText().toString().equals(betAmountDisplay)) {
                    if (!arrayList.get(i).isEnabled()) {
                        constraintLayout.setAlpha(0.5f);
                        constraintLayout.setClickable(false);
                    } else if (constraintLayout.getAlpha() != 1.0f) {
                        constraintLayout.setAlpha(1.0f);
                        constraintLayout.setEnabled(true);
                        constraintLayout.setClickable(true);
                        constraintLayout.setFocusable(true);
                    }
                }
                i2 = i4;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        boolean z = d0Var instanceof a;
        Context context = this.b;
        ArrayList<BetChipItem> arrayList = this.c;
        if (!z) {
            if (d0Var instanceof el7) {
                final el7 el7Var = (el7) d0Var;
                ConstraintLayout constraintLayout = el7Var.b;
                final zk7 zk7Var = new zk7(this);
                if (!el7Var.v) {
                    constraintLayout.setOnTouchListener(new View.OnTouchListener() { // from class: dl7
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            el7 el7Var2 = el7Var;
                            Animation animation = el7Var2.f;
                            ConstraintLayout constraintLayout2 = el7Var2.b;
                            if (constraintLayout2.isClickable() && el7Var2.a.f) {
                                Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                                if (numValueOf != null && numValueOf.intValue() == 0) {
                                    if (constraintLayout2.getAlpha() != 0.5f) {
                                        constraintLayout2.startAnimation(el7Var2.e);
                                        return true;
                                    }
                                } else {
                                    if (numValueOf != null && numValueOf.intValue() == 1) {
                                        if (constraintLayout2.getAlpha() != 0.5f) {
                                            constraintLayout2.startAnimation(animation);
                                        }
                                        zk7Var.invoke(Double.valueOf(el7Var2.i));
                                        return true;
                                    }
                                    if (numValueOf != null && numValueOf.intValue() == 3) {
                                        constraintLayout2.startAnimation(animation);
                                    }
                                }
                            }
                            return true;
                        }
                    });
                    el7Var.v = true;
                }
                boolean zEquals = Double.valueOf(arrayList.get(i).getBetAmount() % 1.0d).equals(Double.valueOf(0.0d));
                TextView textView = el7Var.c;
                if (zEquals) {
                    textView.setText(arrayList.get(i).getBetAmountDisplay());
                } else {
                    textView.setText(i(arrayList.get(i).getBetAmount()));
                }
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                layoutParams.getClass();
                constraintLayout.post(new Runnable() { // from class: al7
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintLayout constraintLayout2 = el7Var.b;
                        ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                        layoutParams2.getClass();
                        layoutParams2.width = constraintLayout2.getHeight();
                        constraintLayout2.setLayoutParams(layoutParams2);
                    }
                });
                Integer num = jk2.b.get(arrayList.get(i).getChipColor());
                if (num != null) {
                    constraintLayout.setBackground(context.getDrawable(num.intValue()));
                } else {
                    constraintLayout.setBackground(null);
                }
                el7Var.i = arrayList.get(i).getBetAmount();
                constraintLayout.setEnabled(arrayList.get(i).isEnabled());
                if (arrayList.get(i).isEnabled()) {
                    constraintLayout.setAlpha(1.0f);
                    constraintLayout.setClickable(true);
                    constraintLayout.setEnabled(true);
                } else {
                    constraintLayout.setAlpha(0.5f);
                    constraintLayout.setClickable(false);
                }
                if (i == arrayList.size() - 1) {
                    ViewGroup.LayoutParams layoutParams2 = el7Var.d.getLayoutParams();
                    layoutParams2.getClass();
                    ((RecyclerView.LayoutParams) layoutParams2).setMargins((int) context.getResources().getDimension(R.dimen._5sdp), 0, (int) context.getResources().getDimension(R.dimen._5sdp), 0);
                    return;
                }
                return;
            }
            return;
        }
        try {
            final a aVar = (a) d0Var;
            final xk7 xk7Var = new xk7(this);
            aVar.a.setOnTouchListener(new View.OnTouchListener() { // from class: bl7
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    cl7.a aVar2 = aVar;
                    Animation animation = aVar2.d;
                    ConstraintLayout constraintLayout2 = aVar2.a;
                    Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                    if (numValueOf != null && numValueOf.intValue() == 0) {
                        if (constraintLayout2.getAlpha() != 0.5f) {
                            constraintLayout2.startAnimation(aVar2.c);
                            return true;
                        }
                    } else {
                        if (numValueOf != null && numValueOf.intValue() == 1) {
                            if (constraintLayout2.getAlpha() != 0.5f) {
                                constraintLayout2.startAnimation(animation);
                            }
                            xk7Var.invoke(Boolean.TRUE);
                            return true;
                        }
                        if (numValueOf != null && numValueOf.intValue() == 3) {
                            constraintLayout2.startAnimation(animation);
                        }
                    }
                    return true;
                }
            });
            ViewGroup.LayoutParams layoutParams3 = ((a) d0Var).a.getLayoutParams();
            layoutParams3.getClass();
            final a aVar2 = (a) d0Var;
            ((a) d0Var).a.post(new Runnable() { // from class: yk7
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintLayout constraintLayout2 = aVar2.a;
                    ViewGroup.LayoutParams layoutParams4 = constraintLayout2.getLayoutParams();
                    layoutParams4.getClass();
                    layoutParams4.width = constraintLayout2.getHeight();
                    constraintLayout2.setLayoutParams(layoutParams4);
                }
            });
            if (arrayList.get(i).isEnabled()) {
                ((a) d0Var).a.setAlpha(1.0f);
                ((a) d0Var).a.setEnabled(true);
                ((a) d0Var).b.setEnabled(true);
                ((a) d0Var).b.setAlpha(1.0f);
            } else {
                ((a) d0Var).a.setAlpha(0.5f);
                ((a) d0Var).a.setEnabled(false);
                ((a) d0Var).b.setEnabled(false);
                ((a) d0Var).b.setAlpha(0.5f);
            }
            op5.a.getClass();
            String str = op5.c;
            if (str != null) {
                if (c.l(str, "sg_spin_da_bottle", false)) {
                    ((a) d0Var).a.setBackground(context.getDrawable(R.drawable.fbg_chip_sdb));
                    return;
                }
                if (c.l(op5.c, "sg_red_black", false)) {
                    ((a) d0Var).a.setBackground(context.getDrawable(R.drawable.fbg_chip_rb));
                    return;
                }
                if (c.l(op5.c, "sg_even_odd", false)) {
                    ((a) d0Var).a.setBackground(context.getDrawable(R.drawable.fbg_chip_eo));
                } else if (c.l(op5.c, "sg_spin2win", false)) {
                    ((a) d0Var).a.setBackground(context.getDrawable(R.drawable.fbg_chip_s2w));
                } else {
                    ((a) d0Var).a.setBackground(context.getDrawable(R.drawable.fbg_chip_sm));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 1) {
            View viewA = dzc.a(viewGroup, R.layout.sg_main_fbg_item, viewGroup, false);
            viewA.getClass();
            return new a(viewA);
        }
        View viewA2 = dzc.a(viewGroup, R.layout.sg_main_chip_item, viewGroup, false);
        viewA2.getClass();
        return new el7(viewA2, this);
    }
}
