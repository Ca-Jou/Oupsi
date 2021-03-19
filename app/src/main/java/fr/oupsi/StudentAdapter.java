package fr.oupsi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    EpsiActivity activity;
    Student student;

    public StudentAdapter(EpsiActivity activity, Student student){
        this.activity=activity;
        this.student=student;
    }

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageViewAvatar;
        private final TextView textViewName;
        private final TextView textViewEmail;
        private final TextView textViewGroup;
        private final TextView textViewUrl;
//        private final View layoutProfileStudent;

        public ViewHolder(View view) {
            super(view);

            imageViewAvatar = view.findViewById(R.id.imageViewAvatar);
            textViewName = view.findViewById(R.id.textViewName);
            textViewEmail = view.findViewById(R.id.textViewEmail);
            textViewGroup = view.findViewById(R.id.textViewGroup);
            textViewUrl = view.findViewById(R.id.textViewUrl);

//            layoutProfileStudent = view.findViewById(R.id.layoutProfileStudent);
        }

        public ImageView getImageViewAvatar() {
            return imageViewAvatar;
        }

        public TextView getTextViewName() {
            return textViewName;
        }

        public TextView getTextViewEmail() {
            return textViewEmail;
        }

        public TextView getTextViewGroup() {
            return textViewGroup;
        }

        public TextView getTextViewUrl() {
            return textViewUrl;
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.profile_student, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.get().load("file:"+student.getAvatar()).into(holder.getImageViewAvatar());
        holder.getTextViewName().setText(student.getFirstName());
        holder.getTextViewEmail().setText(student.getEmail());
        holder.getTextViewGroup().setText(student.getGroup());
        holder.getTextViewUrl().setText(student.getUrl());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}