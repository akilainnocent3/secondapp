package com.sportybet.plugin.realsports.data;

/* JADX INFO: loaded from: classes7.dex */
public class JackpotSelection implements Comparable<JackpotSelection> {
    public String desc;
    public String id;
    public int status;

    @Override // java.lang.Comparable
    public int compareTo(JackpotSelection jackpotSelection) {
        String str = this.id;
        if (str == null) {
            return jackpotSelection.id == null ? 0 : -1;
        }
        return str.compareTo(jackpotSelection.id);
    }
}
