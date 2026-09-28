package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.sportygames.sportysoccer.virtualkeyboard.a;
import com.sportygames.sportysoccer.widget.StakeLayout;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class xsd0 implements a.b {
    public final /* synthetic */ List a;
    public final /* synthetic */ StakeLayout b;

    public xsd0(StakeLayout stakeLayout, List list) {
        this.b = stakeLayout;
        this.a = list;
    }

    @Override // com.sportygames.sportysoccer.virtualkeyboard.a.b
    public final void a() {
        StakeLayout stakeLayout = this.b;
        EditText editText = stakeLayout.M;
        editText.setSelection(editText.getText().length());
        Editable text = stakeLayout.M.getText();
        int selectionStart = stakeLayout.M.getSelectionStart();
        if (text != null && text.length() > 0 && selectionStart > 0) {
            text.delete(selectionStart - 1, selectionStart);
        }
        stakeLayout.H();
    }

    @Override // com.sportygames.sportysoccer.virtualkeyboard.a.b
    public final void b(int i) {
        StakeLayout stakeLayout = this.b;
        if ((i == 10 || i == 12) && stakeLayout.M.getText().toString().length() == 0) {
            return;
        }
        EditText editText = stakeLayout.M;
        editText.setSelection(editText.getText().length());
        EditText editText2 = stakeLayout.M;
        if (i == 13) {
            Editable text = editText2.getText();
            if (text != null && text.length() > 0) {
                text.delete(0, text.length());
            }
            stakeLayout.M.setText("");
            stakeLayout.H();
            return;
        }
        Editable text2 = editText2.getText();
        String string = text2.toString();
        if (TextUtils.equals(string, ".") && stakeLayout.M.getSelectionStart() > 0) {
            text2.insert(0, "0");
        }
        int iIndexOf = string.indexOf(46);
        int i2 = 0;
        for (int i3 = 0; i3 < string.length(); i3++) {
            if (string.charAt(i3) == '.') {
                i2++;
            }
        }
        int length = stakeLayout.M.getText().length();
        List list = this.a;
        if (i2 == 0) {
            if (i != 11 || string.length() - length <= 2) {
                text2.insert(length, (CharSequence) list.get(i));
            }
        } else if (i2 == 1 && i != 11) {
            if (length <= iIndexOf || (string.length() - iIndexOf) - 1 < 2) {
                text2.insert(length, (CharSequence) list.get(i));
            }
            String strSubstring = string.substring(string.indexOf(46));
            if (i == 12 && strSubstring.length() == 2) {
                int selectionStart = stakeLayout.M.getSelectionStart();
                text2.delete(selectionStart - 1, selectionStart);
            }
        }
        stakeLayout.H();
    }

    @Override // com.sportygames.sportysoccer.virtualkeyboard.a.b
    public final void c() {
        StakeLayout stakeLayout = this.b;
        Editable text = stakeLayout.M.getText();
        if (text != null && text.length() > 0) {
            text.delete(0, text.length());
        }
        stakeLayout.M.setText("");
        stakeLayout.H();
    }
}
