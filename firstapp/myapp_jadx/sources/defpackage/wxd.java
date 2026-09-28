package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wxd {
    public static final wxd a;
    public static final wxd b;
    public static final wxd c;
    public static final wxd d;
    public static final wxd e;
    public static final /* synthetic */ wxd[] f;

    static {
        wxd wxdVar = new wxd("DEDICATED_ACCOUNT_MAIN_PAGE", 0);
        a = wxdVar;
        wxd wxdVar2 = new wxd("DEDICATED_ACCOUNT_TUTORIAL_PAGE", 1);
        b = wxdVar2;
        wxd wxdVar3 = new wxd("DEDICATED_ACCOUNT_TUTORIAL_DIALOG", 2);
        c = wxdVar3;
        wxd wxdVar4 = new wxd("COLUMN_DEDICATED_ACCOUNT_LIST", 3);
        d = wxdVar4;
        wxd wxdVar5 = new wxd("COLUMN_SPORTY_BANK_LIST", 4);
        e = wxdVar5;
        f = new wxd[]{wxdVar, wxdVar2, wxdVar3, wxdVar4, wxdVar5};
    }

    public wxd() {
        throw null;
    }

    public static wxd valueOf(String str) {
        return (wxd) Enum.valueOf(wxd.class, str);
    }

    public static wxd[] values() {
        return (wxd[]) f.clone();
    }
}
