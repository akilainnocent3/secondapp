package com.sportybet.android.user.selfexclusion;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.selfexclusion.SelfExclusionIntroFragment;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.nae0;
import defpackage.psm;
import defpackage.q2m;
import defpackage.sn5;
import defpackage.sxi;
import defpackage.tit;

/* JADX INFO: loaded from: classes5.dex */
public class SelfExclusionIntroFragment extends q2m implements View.OnClickListener {
    public sxi B;
    public psm C;

    /* JADX INFO: loaded from: classes6.dex */
    public class a implements tit {

        /* JADX INFO: renamed from: com.sportybet.android.user.selfexclusion.SelfExclusionIntroFragment$a$a, reason: collision with other inner class name */
        public class C0355a extends Thread {
            public C0355a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                SelfExclusionIntroFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: ga80
                    @Override // java.lang.Runnable
                    public final void run() {
                        NavHostFragment.a.a(SelfExclusionIntroFragment.this).f(R.id.action_intro_to_setup, null);
                    }
                });
            }
        }

        public a() {
        }

        @Override // defpackage.tit
        public final void w(Account account, boolean z) {
            if (account == null) {
                return;
            }
            new C0355a().start();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.btn_setup) {
            this.i.demandAccount(getActivity(), new a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_self_exclusion_intro, viewGroup, false);
        int i4 = R.id.btn_setup;
        Button button = (Button) h5e.a(R.id.btn_setup, viewInflate);
        if (button != null) {
            i4 = R.id.content;
            TextView textView = (TextView) h5e.a(R.id.content, viewInflate);
            if (textView != null) {
                i4 = R.id.notify_content_1;
                if (((TextView) h5e.a(R.id.notify_content_1, viewInflate)) != null) {
                    i4 = R.id.notify_content_2;
                    if (((TextView) h5e.a(R.id.notify_content_2, viewInflate)) != null) {
                        i4 = R.id.title;
                        TextView textView2 = (TextView) h5e.a(R.id.title, viewInflate);
                        if (textView2 != null) {
                            this.B = new sxi((ConstraintLayout) viewInflate, button, textView, textView2);
                            if (this.C.O()) {
                                i = R.string.self_exclusion__self_exclusion__ZA;
                                i2 = R.string.self_exclusion__set_up_self_exclusion__ZA;
                                i3 = R.string.self_exclusion__intro_1__ZA;
                            } else {
                                i = R.string.self_exclusion__self_exclusion;
                                i2 = R.string.self_exclusion__set_up_self_exclusion;
                                i3 = R.string.self_exclusion__intro_1;
                            }
                            this.B.d.setText(sn5.d(this, i, new Object[0]));
                            this.B.b.setText(sn5.d(this, i2, new Object[0]));
                            this.B.c.setText(nae0.a(sn5.d(this, i3, new Object[0])));
                            this.B.b.setOnClickListener(this);
                            return this.B.a;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        return null;
    }
}
