package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.social.domain.entity.MySocialCreationSource;
import com.sportybet.android.social.presentation.creation.MySocialCreationActivity;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class u27 implements esm {
    @Override // defpackage.esm
    public final void a(Context context) {
        int i = MySocialCreationActivity.b;
        MySocialCreationSource.Challenge challenge = MySocialCreationSource.Challenge.a;
        challenge.getClass();
        Intent intent = new Intent(context, (Class<?>) MySocialCreationActivity.class);
        intent.putExtras(vj5.a(new Pair("KEY_MY_SOCIAL_CREATION_SOURCE", challenge), new Pair("KEY_MY_SOCIAL_CREATION_NAME", "")));
        context.startActivity(intent);
    }
}
