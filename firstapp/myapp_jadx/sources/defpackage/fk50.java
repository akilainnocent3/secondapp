package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfk50;", "Ljava/io/IOException;", "Lcom/sporty/android/common_ui/uitext/UiText;", "text", "<init>", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "Lcom/sporty/android/common_ui/uitext/UiText;", "getText", "()Lcom/sporty/android/common_ui/uitext/UiText;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class fk50 extends IOException {
    public static final int $stable = 8;
    private final UiText text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk50(UiText uiText) {
        super(uiText.toString());
        uiText.getClass();
        this.text = uiText;
    }

    public final UiText getText() {
        return this.text;
    }
}
