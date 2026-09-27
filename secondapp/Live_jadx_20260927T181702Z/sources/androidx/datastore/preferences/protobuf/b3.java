package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface b3 extends w2 {
    String getName();

    u getNameBytes();

    k3 getOptions(int index);

    int getOptionsCount();

    List<k3> getOptionsList();

    boolean getRequestStreaming();

    String getRequestTypeUrl();

    u getRequestTypeUrlBytes();

    boolean getResponseStreaming();

    String getResponseTypeUrl();

    u getResponseTypeUrlBytes();

    j4 getSyntax();

    int getSyntaxValue();
}
