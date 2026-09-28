package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.button.MaterialButton;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.data.LeftMenuButton;
import com.sportygames.roulette.data.LeftMenuButtonKey;
import com.sportygames.roulette.util.HowToPlayView;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class n4s extends RecyclerView.f<o4s> implements View.OnClickListener {
    public List<LeftMenuButton> a;
    public LayoutInflater b;
    public RouletteActivity c;
    public int d;
    public int e;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ o4s a;
        public final /* synthetic */ TextView b;
        public final /* synthetic */ TextView c;

        public a(o4s o4sVar, TextView textView, TextView textView2) {
            this.a = o4sVar;
            this.b = textView;
            this.c = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o4s o4sVar = this.a;
            o4sVar.f.animate().translationX(0.0f).setDuration(0L);
            this.b.setVisibility(8);
            TextView textView = this.c;
            textView.setVisibility(0);
            textView.setAlpha(1.0f);
            o4sVar.c.setVisibility(0);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LeftMenuButtonKey.values().length];
            a = iArr;
            try {
                iArr[LeftMenuButtonKey.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LeftMenuButtonKey.SOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    public final void i(o4s o4sVar, LeftMenuButton leftMenuButton) {
        RouletteActivity rouletteActivity = this.c;
        int i = b.a[leftMenuButton.getTag().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            boolean z = !rouletteActivity.z;
            rouletteActivity.z = z;
            wn20.c(rouletteActivity.g0, "roulette", "audio_on", z, false);
            if (rouletteActivity.z) {
                wz.a("Sound", "Roulette", "On");
            } else {
                wz.a("Sound", "Roulette", "Off");
            }
            k(leftMenuButton, !leftMenuButton.getToggleState(), o4sVar);
            return;
        }
        boolean z2 = !rouletteActivity.A;
        rouletteActivity.A = z2;
        wn20.c(rouletteActivity.g0, "roulette", "music_on", z2, false);
        if (rouletteActivity.A) {
            rouletteActivity.F1();
            wz.a("Music", "Roulette", "On");
        } else {
            rouletteActivity.V1();
            wz.a("Music", "Roulette", "Off");
        }
        k(leftMenuButton, !leftMenuButton.getToggleState(), o4sVar);
    }

    public final void j(o4s o4sVar, int i, TextView textView, TextView textView2, int i2) {
        ConstraintLayout constraintLayout = o4sVar.c;
        MaterialButton materialButton = o4sVar.f;
        long j = constraintLayout.getVisibility() == 0 ? 200L : 20L;
        textView2.setAlpha(0.0f);
        ((fcv) constraintLayout.getBackground()).s(o0b.b(this.c, i));
        materialButton.animate().translationX(vs50.a(materialButton.getWidth(), 3.5f, constraintLayout.getWidth(), i2)).alpha(1.0f).setListener(new a(o4sVar, textView2, textView)).setDuration(j);
    }

    public final void k(LeftMenuButton leftMenuButton, boolean z, o4s o4sVar) {
        leftMenuButton.setToggleState(z);
        if (z) {
            j(o4sVar, this.d, o4sVar.d, o4sVar.e, 1);
        } else {
            j(o4sVar, this.e, o4sVar.e, o4sVar.d, -1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final o4s o4sVar = (o4s) d0Var;
        final LeftMenuButton leftMenuButton = this.a.get(i);
        o4sVar.itemView.setOnClickListener(this);
        TextView textView = o4sVar.b;
        ConstraintLayout constraintLayout = o4sVar.c;
        textView.setText(leftMenuButton.getName());
        ea50<Drawable> ea50VarO = com.bumptech.glide.a.f(this.c).o(Integer.valueOf(leftMenuButton.getIcon()));
        ImageView imageView = o4sVar.a;
        ea50VarO.M(imageView);
        if (leftMenuButton.getIconSize() != null) {
            imageView.getLayoutParams().width = (int) imageView.getResources().getDimension(leftMenuButton.getIconSize().width);
            imageView.getLayoutParams().height = (int) imageView.getResources().getDimension(leftMenuButton.getIconSize().height);
            imageView.requestLayout();
        }
        if (!leftMenuButton.isToggle()) {
            constraintLayout.setVisibility(8);
            return;
        }
        constraintLayout.setVisibility(0);
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: l4s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(o4sVar, leftMenuButton);
            }
        });
        o4sVar.f.setOnClickListener(new View.OnClickListener() { // from class: m4s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(o4sVar, leftMenuButton);
            }
        });
        k(leftMenuButton, leftMenuButton.getToggleState(), o4sVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ((RecyclerView) view.getParent()).getClass();
        LeftMenuButton leftMenuButton = this.a.get(RecyclerView.P(view));
        if (leftMenuButton.isToggle()) {
            return;
        }
        final RouletteActivity rouletteActivity = this.c;
        LeftMenuButtonKey tag = leftMenuButton.getTag();
        rouletteActivity.getClass();
        int i = RouletteActivity.l.a[tag.ordinal()];
        if (i == 1) {
            wz.a("HTPClicked", "Roulette", new String[0]);
            if (rouletteActivity.U == null) {
                HowToPlayView howToPlayView = new HowToPlayView(rouletteActivity);
                rouletteActivity.U = howToPlayView;
                rouletteActivity.Z.addView(howToPlayView);
            }
            HowToPlayView howToPlayView2 = rouletteActivity.U;
            int height = rouletteActivity.Z.getHeight();
            howToPlayView2.setVisibility(0);
            howToPlayView2.setTranslationY(height);
            howToPlayView2.animate().translationY(0.0f);
            ScrollView scrollView = howToPlayView2.a;
            if (scrollView != null) {
                scrollView.scrollTo(0, 0);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            wz.a("withDrawClicked", "Roulette", new String[0]);
            SportyGamesManager.getInstance().gotoSportyBet(xae.e, null);
            return;
        }
        wz.a("shareModalOpened", "Roulette", new String[0]);
        final String str = SportyGamesManager.getInstance().getBasePrefixUrl() + SportyGamesManager.getInstance().getCountry() + "/applink/freqGames?game=roulette";
        final m090 m090Var = new m090();
        final com.google.android.material.bottomsheet.b bVar = new com.google.android.material.bottomsheet.b(rouletteActivity, R.style.SGShareDialogTheme);
        bVar.setContentView(R.layout.sg_rut_share_sheet);
        bVar.getWindow().setBackgroundDrawable(new ColorDrawable(rouletteActivity.getResources().getColor(R.color.black_05)));
        bVar.findViewById(R.id.whatsAppLayout).setOnClickListener(new View.OnClickListener(m090Var, str, rouletteActivity, bVar) { // from class: h090
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ b c;

            {
                this.a = str;
                this.b = rouletteActivity;
                this.c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2 = this.a;
                Context context = this.b;
                b bVar2 = this.c;
                try {
                    int[] iArr = RouletteActivity.A0;
                    wz.a("shareOptionClicked", "Roulette", "whatsapp");
                    m090.b(context, "com.whatsapp", str2);
                    bVar2.dismiss();
                } catch (Exception unused) {
                    bVar2.dismiss();
                    m090.a(context, context.getString(R.string.sg_please_install_whatsapp));
                }
            }
        });
        bVar.findViewById(R.id.twitterLayout).setOnClickListener(new View.OnClickListener(m090Var, str, rouletteActivity, bVar) { // from class: i090
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ b c;

            {
                this.a = str;
                this.b = rouletteActivity;
                this.c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2 = this.a;
                Context context = this.b;
                b bVar2 = this.c;
                try {
                    int[] iArr = RouletteActivity.A0;
                    wz.a(qUnCRF.HZVLrS, "Roulette", "x");
                    m090.b(context, "com.twitter.android", str2);
                    bVar2.dismiss();
                } catch (Exception unused) {
                    bVar2.dismiss();
                    m090.a(context, context.getString(R.string.sg_please_install_twitter));
                }
            }
        });
        bVar.findViewById(R.id.facebookLayout).setOnClickListener(new View.OnClickListener(m090Var, str, rouletteActivity, bVar) { // from class: j090
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ b c;

            {
                this.a = str;
                this.b = rouletteActivity;
                this.c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String str2 = this.a;
                Context context = this.b;
                b bVar2 = this.c;
                try {
                    int[] iArr = RouletteActivity.A0;
                    wz.a("shareOptionClicked", "Roulette", "facebook");
                    m090.b(context, "com.facebook.katana", str2);
                    bVar2.dismiss();
                } catch (Exception unused) {
                    bVar2.dismiss();
                    m090.a(context, context.getString(R.string.sg_please_install_facebook));
                }
            }
        });
        bVar.findViewById(R.id.crossIcon).setOnClickListener(new View.OnClickListener() { // from class: k090
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int[] iArr = RouletteActivity.A0;
                wz.a("shareModalClosed", "Roulette", new String[0]);
                bVar.dismiss();
            }
        });
        bVar.show();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o4s(this.b.inflate(R.layout.sg_left_menu_item, viewGroup, false));
    }
}
