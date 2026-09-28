package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.activity.LanguagePreferenceActivity;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bmr extends RecyclerView.f<cmr> {
    public final LanguagePreferenceActivity a;
    public final LanguagePreferenceActivity b;
    public final jmr c;
    public final uqm d;

    public bmr(LanguagePreferenceActivity languagePreferenceActivity, LanguagePreferenceActivity languagePreferenceActivity2, jmr jmrVar, uqm uqmVar) {
        uqmVar.getClass();
        this.a = languagePreferenceActivity;
        this.b = languagePreferenceActivity2;
        this.c = jmrVar;
        this.d = uqmVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        cmr cmrVar = (cmr) d0Var;
        cmrVar.getClass();
        String languageName = this.d.getLanguageName();
        ArrayList arrayListC = this.c.c();
        if (i < arrayListC.size()) {
            String str = (String) arrayListC.get(i);
            boolean zEquals = TextUtils.equals(languageName, (CharSequence) arrayListC.get(i));
            str.getClass();
            cmrVar.a.setText(str);
            cmrVar.b.setVisibility(zEquals ? 0 : 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = this.a.getLayoutInflater().inflate(R.layout.item_language, viewGroup, false);
        viewInflate.getClass();
        final cmr cmrVar = new cmr(viewInflate);
        cmrVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: amr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguagePreferenceActivity languagePreferenceActivity = this.a.b;
                if (languagePreferenceActivity != null) {
                    int absoluteAdapterPosition = cmrVar.getAbsoluteAdapterPosition();
                    jmr jmrVar = languagePreferenceActivity.b;
                    if (jmrVar == null) {
                        Intrinsics.n("languageUtil");
                        throw null;
                    }
                    ArrayList arrayListB = jmrVar.b();
                    if (absoluteAdapterPosition < 0 || absoluteAdapterPosition >= arrayListB.size()) {
                        return;
                    }
                    languagePreferenceActivity.getAccountHelper().setLanguage((String) arrayListB.get(absoluteAdapterPosition));
                }
            }
        });
        return cmrVar;
    }
}
