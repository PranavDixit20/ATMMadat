package adservices.atmmadat;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class ImageLoader {
    static FirebaseStorage storage = FirebaseStorage.getInstance();
   static StorageReference storageRef = storage.getReferenceFromUrl("gs://atmmadat.appspot.com");


    public  static void upload(Context ctx, String imgname, ImageView imv){
        StorageReference sref = storageRef.child("BankImages/"+imgname);
        Glide.with(ctx).using(new FirebaseImageLoader()).load(sref).into(imv);
    }
}
