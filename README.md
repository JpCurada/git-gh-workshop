<div align="center">

# Git and Github Workshop 

![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

![GitHub repo size](https://img.shields.io/github/repo-size/JpCurada/git-gh-workshop?style=flat-square)
![GitHub contributors](https://img.shields.io/github/contributors/JpCurada/git-gh-workshop?style=flat-square)
![GitHub last commit](https://img.shields.io/github/last-commit/JpCurada/git-gh-workshop?style=flat-square)

Resources for Git and Github Workshop

I created this repository to serve as a guide for beginners wanting to learn git and github from scratch.

</div>
helooo
## What You Need Before Starting

- A computer (Windows, Mac, or Linux)
- Internet connection
- School email (optional, for student benefits)

## What Are Git and GitHub?

**Git** = Software that tracks changes in your code files
- Like "save" but shows you what changed
- Lets you go back to older versions
- Helps teams work on the same project

**GitHub** = Website that stores your Git projects online
- Like Google Drive for code
- Share projects with others
- Backup your work in the cloud

---

## Installing Git

I use the terminal because it's faster than clicking around. Let's learn it together.

### For Windows Users

1. **Open Command Prompt**
   - Press `Windows + R`
   - Type `cmd`
   - Press Enter

2. **Check if WinGet is available**
   ```bash
   winget --version
   ```
   Should show something like: `v1.11.430`

3. **Install Git**
   ```bash
   winget install --id Git.Git -e --source winget
   ```

### For Mac Users

```bash
# Option 1: Using Homebrew (recommended)
brew install git

# Option 2: Using Xcode tools
xcode-select --install
```

### For Linux Users

```bash
# Ubuntu/Debian
sudo apt update && sudo apt install git

# Fedora/CentOS
sudo dnf install git

# Arch Linux
sudo pacman -S git
```

---

## Creating Your GitHub Account

1. Go to [github.com](https://github.com)
2. Click "Sign up"
3. Fill in:
   - Email address
   - Password
   - Username (pick carefully - hard to change later)
4. Verify your email
5. Choose Free plan

---

## GitHub Student Pack (Optional)

**What you get:**
- GitHub Pro features for free
- Free website hosting
- Premium developer tools
- Private repositories

**How to apply:**
1. Go to [education.github.com](https://education.github.com/pack)
2. Click "Get benefits"
3. Select "Student"
4. Enter your school information
5. Upload student ID or enrollment proof
6. Wait for approval (usually 1-3 days)

---

## Setting Up Git

### Step 1: Check Installation
```bash
git --version
```
Should show: `git version 2.xx.x`

### Step 2: Tell Git Who You Are
```bash
git config --global user.name "YourGitHubUsername"
git config --global user.email "your-email@example.com"
```

**Important:** Use the same email as your GitHub account.

### Step 3: Verify Setup
```bash
git config --list
```
You should see your name and email in the output.

---

## Common Problems and Fixes

**Problem:** `git: command not found`  
**Fix:** Restart your terminal, or reinstall Git

**Problem:** Can't push to GitHub  
**Fix:** Set up SSH keys or use personal access tokens

**Problem:** "Author identity unknown"  
**Fix:** Run the config commands from Step 2 again

---

## What's Next?

Now you can:
1. Create your first repository on GitHub
2. Learn basic Git commands (clone, add, commit, push)
3. Practice with a simple project
4. Learn about branches and pull requests

## Useful Resources

- [Git Handbook](https://guides.github.com/introduction/git-handbook/)
- [GitHub Hello World](https://guides.github.com/activities/hello-world/)
- [Interactive Git Tutorial](https://learngitbranching.js.org/)

---

Remember: Git and GitHub are tools to make your coding life easier. Don't worry if it feels confusing at first - everyone starts somewhere.